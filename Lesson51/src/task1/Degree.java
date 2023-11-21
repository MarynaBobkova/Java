package task1;

public enum Degree {
    BACHELOR("Bachelor"),
    MASTER("Master");

    private String description;

    Degree(String description){
        this.description = description;
    }

    public  String getDescription() {
        return description;
    }
}
