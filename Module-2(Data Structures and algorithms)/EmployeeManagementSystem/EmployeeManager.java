import java.util.Scanner;

class EmployeeManager {
    Scanner sc = new Scanner(System.in);
    Employee employees[] = new Employee[100];
    int c= 0;


    void addEmployee() {

    System.out.print( "Enter Employee ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Name: ");
    String name =sc.nextLine();

    System.out.print("Enter Position: ");
    String position =sc.nextLine();

    System.out.print("Enter Salary: ");
    double salary =sc.nextDouble();

    employees[c] =new Employee(id,name,position,salary);

    c++;

    System.out.println("Employee Added");
    }



    void searchEmployee() {
    System.out.print( "Enter Employee ID: ");
    int id = sc.nextInt();

    for(int i = 0;i<c;i++) {
        if(employees[i].employeeId == id) {
            System.out.println( "Employee Found");
            System.out.println(employees[i].employeeId);
            System.out.println(employees[i].name);
            System.out.println(employees[i].position);
            System.out.println(employees[i].salary);
            return;
        }
    }

    System.out.println("Employee Not Found");
}



void traverseEmployees() {
    if(c == 0) {
        System.out.println("No Employees");
        return;
    }
    for(int i = 0;i < c;i++) {
        System.out.println("ID: " +employees[i].employeeId);
        System.out.println("Name: " +employees[i].name);
        System.out.println("Position: " +employees[i].position);
        System.out.println("Salary: " +employees[i].salary);
    }
}




void deleteEmployee() {
    System.out.print("Enter Employee ID: ");

    int id = sc.nextInt();
    int index = -1;

    for(int i = 0;i <c;i++) {
        if(employees[i].employeeId == id) {
            index = i;
            break;
        }
    }
    if(index == -1) {
        System.out.println("Employee Not Found");
        return;
    }
    for(int i = index;i < c- 1;i++) {
        employees[i] =
                employees[i + 1];
    }
    c--;
    System.out.println("Employee Deleted");
}
}