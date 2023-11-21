package task1;

public class Student {
    private  String name;
    private int age;
    private int course;
    private double averageRate;
    private Degree degree;

    public Student(String name, int age, int course, double averageRate, Degree degree) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.averageRate = averageRate;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(double averageRate) {
        this.averageRate = averageRate;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Student student = (Student) object;

        if (age != student.age) return false;
        if (course != student.course) return false;
        if (Double.compare(averageRate, student.averageRate) != 0) return false;
        if (!name.equals(student.name)) return false;
        return degree == student.degree;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + course;
        temp = Double.doubleToLongBits(averageRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + degree.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", averageRate=" + averageRate +
                ", degree=" + degree +
                '}';
    }
}
