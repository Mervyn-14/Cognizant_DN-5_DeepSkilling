import java.util.Scanner;

public class FinancialForecasting {

    static double predictValue(double currentValue, double growthRate,int years) {

        if(years == 0)
            return currentValue;

        return predictValue(currentValue* (1+growthRate), growthRate, years-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print( "Enter Current Value: ");
        double currentValue =  sc.nextDouble();

        System.out.print("Enter Growth Rate (%): ");
        double growthRate = sc.nextDouble() / 100;

        System.out.print( "Enter Number of Years: ");
        int years = sc.nextInt();

        double futureValue =predictValue( currentValue, growthRate, years);
        System.out.println("\nFuture Value = "+ futureValue);

        sc.close();
    }
}