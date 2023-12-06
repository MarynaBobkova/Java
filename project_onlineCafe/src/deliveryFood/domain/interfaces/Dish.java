package deliveryFood.domain.interfaces;

public interface Dish {
    int getId();
    boolean isAvailable();
    void setAvailable(boolean available);
    String getName();
    double getPrice();
}
