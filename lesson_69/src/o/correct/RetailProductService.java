package o.correct;

public class RetailProductService implements ProductService {

    @Override
    public void generateArticle(Product product) {
        product.setArticle("R-" + product.getName());
    }
}