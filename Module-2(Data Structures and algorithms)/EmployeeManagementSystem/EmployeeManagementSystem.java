import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        EmployeeManager em =new EmployeeManager();

        while(true) {
            System.out.println("\n1.Add Employee");
            System.out.println("2.Search Employee");
            System.out.println("3.Display Employees");
            System.out.println("4.Delete Employee");
            System.out.println("5.Exit");

            int choice =sc.nextInt();

            switch(choice) {
                case 1:
                    em.addEmployee();
                    break;
                case 2:
                    em.searchEmployee();
                    break;
                case 3:
                    em.traverseEmployees();
                    break;
                case 4:
                    em.deleteEmployee();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}