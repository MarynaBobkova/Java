package local_inner_classes;

/**
 * @author Andrej Reutow
 * created on 25.10.2023
 */
// Здесь Task является локальным вложенным классом в методе executeTask().
public class TaskManager {
    public void executeTask(String taskName) {
        class Task {
            void run() {
                System.out.println(taskName + " is running.");
            }
        }

        new Task().run();
    }

    public static void main(String[] args) {
        new TaskManager().executeTask("FileDownload");
    }
}

