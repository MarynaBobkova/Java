package main.java.app.services;

import app.domain.Product;
import app.repositories.ProductRepository;

import java.util.List;

/**
 * Это сервис, который разрабатывает наша команда разработчиков.
 * И в своей работе наш сервис должен использовать MerchService,
 * который разрабатывается другой командой разработчиков.
 */
public class ProductService implements Service<Product> {

    private ProductRepository repository;
    private MerchService merchService;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void setMerchService(MerchService merchService) {
        this.merchService = merchService;
    }

    /**
     * Метод, возвращающий все продукты из БД.
     * В этом методе мы должны запросить у стороннего сервиса,
     * нужна ли информация о поставщике, и если нет, то удалить её из объектов продуктов.
     *
     * @return список всех продуктов.
     */
    @Override
    public List<Product> getAll() {
        List<Product> products = repository.getAll();

        if (merchService.withoutSupplierInfo()) {
            products.forEach(x -> x.setSupplier(null));
        }

        return products;
    }

    /**
     * Метод возвращает один продукт из БД по идентификатору.
     * В этом методе мы должны запросить у стороннего сервиса
     * наценку на продукт и применить её к цене этого продукта.
     *
     * @param id    идентификатор продукта.
     * @return      объект продукта, соответствующий идентификатору, с применённой наценкой.
     */
    @Override
    public Product getById(int id) {
        Product product = repository.getById(id);

        if (product != null) {
            double markup = merchService.getMarkup();
            double newPrice = product.getPrice() * (100 + markup) / 100;
            product.setPrice(newPrice);
        }

        return product;
    }

    /**
     * Метод, сохраняющий продукт в БД.
     * В этом методе мы должны обращаться к стороннему сервису,
     * чтобы он присвоил нашему продукту артикул, и после этого сохранить его в БД.
     *
     * @param product   сохраняемый продукт.
     * @return          продукт с присвоенным идентификатором и артикулом.
     */
    @Override
    public Product save(Product product) {
        merchService.setArticle(product);
        return repository.save(product);
    }

    /**
     * Метод, удаляющий продукт из БД по идентификатору.
     * В этом методе мы должны запросить у стороннего сервиса, нужно ли полное удаление.
     * Если да - удаляем продукт из БД.
     * Если нет - просто делаем продукт неактивным.
     *
     * @param id идентификатор продукта.
     */
    @Override
    public void deleteById(int id) {
        if (merchService.fullDeletion()) {
            repository.deleteById(id);
        } else {
            Product product = repository.getById(id);

            if (product != null) {
                product.setActive(false);
            }
        }
    }
}