package task1;

public class ThirdStudentFilter implements Filter{
    @Override
    public boolean test(Student student) {
        return student.getCourse() == 1 && student.getAge() <= 25;
    }
}
