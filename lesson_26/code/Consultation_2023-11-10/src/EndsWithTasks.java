/**
 * @author Andrej Reutow
 * created on 11.10.2023
 */
public class EndsWithTasks {

    public static void main(String[] args) {
        String name1 = "Task1.java";
        String name2 = "menu.txt";
        String name3 = "postbank.csv";
        String name4 = "bank.csv";
        String name5 = "cv.pdf";

        String[] names = {name1, name2, name3, name4, name5};
        String searchExtension = "pdf";

        for (int i = 0; i < names.length; i++) {
            String currentValue = names[i];

            // 1 подход
            int pointIndex = currentValue.indexOf("."); // cv.pdf => 3
            String fileNameExtension = currentValue.substring(pointIndex + 1); // cv.pdf => pdf
            if (fileNameExtension.equals(searchExtension)) {
                System.out.println(currentValue);
            }

            // 2 подход
            String[] strings = currentValue.split("\\.");
            if (strings.length == 2) {
                String fileNameExtension2 = strings[1];
                if (fileNameExtension2.equals(searchExtension)) {
                    System.out.println(currentValue);
                }
            }

            // 3 подход
            if (currentValue.endsWith(searchExtension)) {
                System.out.println(currentValue);
            }
        }

    }
}
