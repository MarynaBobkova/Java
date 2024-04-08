package o.correct;

public class WholesaleProductService implements ProductService {

    @Override
    public void generateArticle(Product product) {
        product.setArticle("W-" + product.getName());
    }
}