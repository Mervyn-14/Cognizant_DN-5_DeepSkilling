import java.util.*;
public class TaskManagementSystem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        TaskManager tm = new TaskManager();

        while(true) {
            System.out.println("1.Add Task");
            System.out.println("2.Search Task");
            System.out.println("3.Display Tasks");
            System.out.println("4.Delete Task");
            System.out.print("5.Exit");

            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    tm.addTask();
                    break;

                case 2:
                    tm.searchTask();
                    break;

                case 3:
                    tm.traverseTasks();
                    break;

                case 4:
                    tm.deleteTask();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}