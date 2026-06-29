package com.cognizant.ormlearn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.ormlearn.service.EmployeeService;
@SpringBootApplication
public class OrmLearnApplication {
    private static EmployeeService employeeService;
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class,args);
        employeeService = context.getBean(EmployeeService.class);
        testGetAverageSalary();
    }
    private static void testGetAverageSalary() {
        double salary = employeeService.getAverageSalary(1);
        System.out.println("Average Salary = " + salary);
    }
}
