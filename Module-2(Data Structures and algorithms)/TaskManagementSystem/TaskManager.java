import java.util.Scanner;

public class TaskManager {
    Scanner sc = new Scanner(System.in);
    Task head = null;



     void addTask() {
        System.out.print("Enter Task ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Task Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Status: ");
        String status = sc.nextLine();

        Task newTask =new Task(id,name,status);

        if(head==null) {
            head = newTask;
            return;
        }
        Task temp = head;
        while(temp.next != null) {

            temp = temp.next;
        }
        temp.next = newTask;
      }



       void traverseTasks() {
        if(head == null) {
            System.out.println("No Tasks");
            return;
        }

        Task temp = head;
        while(temp != null) {
            System.out.println( temp.taskId + " "+ temp.taskName + " "+ temp.status);
            System.out.println();
            temp = temp.next;
        }
    }


     void searchTask() {

    System.out.print("Enter Task ID to Search: ");
    int id = sc.nextInt();

    Task temp = head;
    while(temp != null) {
        if(temp.taskId == id) {
            System.out.println("Task Found");
            System.out.println(temp.taskId + " "+ temp.taskName + " "+ temp.status);
            return;
        }

        temp = temp.next;
    }

    System.out.println("Task Not Found");
}




    void deleteTask() {

    System.out.print("Enter Task ID to Delete: ");
    int id = sc.nextInt();

    if(head == null) {
        System.out.println("List Empty");
        return;
    }
    if(head.taskId == id) {
        head = head.next;
        System.out.println( "Task Deleted");
        return;
    }

    Task temp = head;

    while(temp.next != null && temp.next.taskId !=id) {
        temp = temp.next;
    }

    if(temp.next == null) {
        System.out.println( "Task Not Found");
    }
    else {
        temp.next = temp.next.next;
        System.out.println("Task Deleted");
    }
}
}

