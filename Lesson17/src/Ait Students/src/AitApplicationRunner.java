import entity.Student;

public class AitApplicationRunner {

    public static void main (String[] args) {
        Student studentMaryna = new Student(14,"Bobkova");
        Student studentNastja = new Student(2, "Chalova", "Anastasia");
        Student studentVitalij = new Student("Vitalij", "Korniienko");
        Student studentMartins = new Student(8);
        Student studentDenis = new Student(6, "Denis", "Lubchenko");

        studentMaryna.setName("Maryna");
        System.out.println(studentMaryna.getId());
        System.out.println(studentMaryna.getName());
        System.out.println(studentMaryna.getLastName());

        studentVitalij.setId(5);
        studentMartins.setName("Martins");
        studentMartins.setLastName("Groza");
        System.out.println();

        studentMaryna.setPresent(true);
        studentNastja.setPresent(true);
        studentVitalij.setPresent(true);
        studentMartins.setPresent(true);
        studentDenis.setPresent(false);

        System.out.println();

        Student [] students = new Student[5];
        students[0] = studentMaryna;
        students[1] = studentNastja;
        students[2] = studentVitalij;
        students[3] = studentMartins;
        students[4] = studentDenis;

        for (int i = 0; i < students.length; i++) {
            Student currentStudent = students[i];
            System.out.println("id: " + currentStudent.getId()
            + " Name: " + currentStudent.getName()
            + " LastName: " + currentStudent.getLastName()
            + " is present: " + currentStudent.isPresent());

        }

    }
}
