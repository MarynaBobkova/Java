package student_list;

/**
 * @author Andrej Reutow
 * created on 27.09.2023
 */
public class Student {

    private String name;
    private String group;
    private boolean isPresent;
    private int answerCount;

    public Student(String name, String group, boolean isPresent, int answerCount) {
        this.name = name;
        this.group = group;
        this.isPresent = isPresent;
        this.answerCount = answerCount;
    }

    public Student(String name, String group, boolean isPresent) {
        this.name = name;
        this.group = group;
        this.isPresent = isPresent;
    }

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public int isAnswerCount() {
        return answerCount;
    }

    public void setAnswerCount(int answerCount) {
        this.answerCount = answerCount;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public void giveAnswer() {
        if (this.isPresent){
            this.answerCount++;
        } else {
            System.out.println("Этого студента нет на уроке, он не может ответить ;)");
        }
    }
}
