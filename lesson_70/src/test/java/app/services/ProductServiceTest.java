package test.java.app.services;

import app.domain.Product;
import app.repositories.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

class ProductServiceTest {

    private ProductService service;

    @Mock
    private MerchService merchService;

    @BeforeEach
    public void init() {
        ProductRepository repository = new ProductRepository();
        service = new ProductService(repository);

        repository.save(new Product("Banana", 120, "Best bananas"));
        repository.save(new Product("Apple", 90, "Best apples"));
        repository.save(new Product("Orange", 190, "Best oranges"));

        merchService = Mockito.mock(MerchService.class);
        service.setMerchService(merchService);
    }

    @Test
    public void checkIfSupplierInfoWasDeleted() {
        when(merchService.withoutSupplierInfo()).thenReturn(true);
        List<Product> products = service.getAll();

        for (Product product : products) {
            assertNull(product.getSupplier());
        }
    }

    @Test
    public void checkIfSupplierInfoWasNotDeleted() {
        List<Product> products = service.getAll();

        for (Product product : products) {
            assertNotNull(product.getSupplier());
        }
    }

    @Test
    public void checkCorrectMarkup() {
        when(merchService.getMarkup()).thenReturn(30.0);
        Product product = service.getById(1);
        double expected = 156;
        double actual = product.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void checkIfCorrectArticleWasSet() {
        Product product = new Product("test", 1, "test");
        String testArticle = "Test777";

        doAnswer(x -> {
            Product product1 = x.getArgument(0);
            product1.setArticle(testArticle);
            return product1;
        }).when(merchService).setArticle(product);

        service.save(product);
        product = service.getById(4);

        assertNotNull(product);
        assertEquals(testArticle, product.getArticle());
    }

    @Test
    public void checkIfInactiveStatusWasSet() {
        service.deleteById(2);
        Product product = service.getById(2);

        assertNotNull(product);
        assertFalse(product.isActive());
    }

    @Test
    public void checkFullDeletion() {
        when(merchService.fullDeletion()).thenReturn(true);
        service.deleteById(2);
        Product product = service.getById(2);

        assertNull(product);
    }
}