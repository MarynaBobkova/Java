package SortSearch;
//  Создайте класс Student с полями id, name и GPA (средний балл).
//
//Реализуйте метод, который сортирует массив студентов по GPA и использует System.arraycopy() для создания нового массива с топ-5 студентами.
//Напишите метод, который принимает средний балл и находит студента с ближайшим средним баллом к данному, используя бинарный поиск.
public class Student implements Comparable <Student>{
        int id;
        String name;
        double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student o) {
        if(gpa > o.gpa) {
            return -1;
        } else  if (gpa < o.gpa) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "\n" + "Student " +
                "id= " + id +
                ", name " + name  +
                ", gpa= " + gpa;
    }
}
