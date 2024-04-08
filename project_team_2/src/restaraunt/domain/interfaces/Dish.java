package restaraunt.domain.interfaces;

public interface Dish {

    int getId();

    String getDishName();

    double getPrice();

    boolean isActive();

    void setPrice(double newPrice);


}
