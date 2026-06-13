import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of orders : ");
        int n = sc.nextInt();
        sc.nextLine();
        Orderblueprint[] orders1 = new Orderblueprint[n];
        Orderblueprint[] orders2 = new Orderblueprint[n];
        for(int i = 0; i < n; i++) {
        System.out.println("\nEnter order " + (i + 1) + " Details");
        System.out.print("Enter order ID : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter customer name : ");
            String name = sc.nextLine();
            System.out.print("Enter total price : ");
            double price = sc.nextDouble();
            orders1[i] =
            new Orderblueprint(id, name, price);
            orders2[i] =
            new Orderblueprint(id, name, price);
        }
        BubbleSort.sort(orders1);
        System.out.println("\n Bubble Sort outcome ");
        for(Orderblueprint o : orders1) {
            o.display();
        }
        QuickSort.quickSort(orders2,0,orders2.length - 1);
        System.out.println("\n Quick Sort outcome");
        for(Orderblueprint o : orders2) {
             o.display();
        }
    }
}