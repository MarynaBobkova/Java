package task1;

/**
 * @author Andrej Reutow
 * created on 26.09.2023
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Andre", 35, "ar@gmail.com");

        // значение такие же как передавали в конструктор
        System.out.println(user.getName());     // Andre
        System.out.println(user.getAge());      // 35
        System.out.println(user.getEmail());    // ar@gmail.com

        System.out.println();
        // изменение значений
        user.setName("Vasja");  // Vasja
        user.setAge(18);        // 18
        user.setEmail("vasja@gmail.com"); // vasja@gmail.com

        // значения изменились
        System.out.println(user.getName());     // Vasja
        System.out.println(user.getAge());      // 18
        System.out.println(user.getEmail());    // vasja@gmail.com
    }
}
