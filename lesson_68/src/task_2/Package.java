package task_2;

public class Package {

    private String from;
    private String to;

    public Package(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        // Посылка {A -> C}
        return String.format("Посылка {%s -> %s}", from, to);
    }
}