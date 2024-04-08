package main.java.example_2;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;
import java.util.Objects;

@JsonAutoDetect
public class Cat {

    private int age;
    private String color;
    private double weight;
    private Owner owner;
    private List<Food> foodList;

    public Cat() {
    }

    public Cat(int age, String color, double weight, Owner owner, List<Food> foodList) {
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.owner = owner;
        this.foodList = foodList;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(color, cat.color) && Objects.equals(owner, cat.owner) && Objects.equals(foodList, cat.foodList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, weight, owner, foodList);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Кот: возраст - ")
                .append(age)
                .append(", цвет - ")
                .append(color)
                .append(", вес - ")
                .append(weight)
                .append(".\n")
                .append("   ")
                .append(owner)
                .append("\n")
                .append("        Список еды:\n");
        for (Food food : foodList) {
            builder.append("        ").append(food).append("\n");
        }
        return builder.toString();
    }
}