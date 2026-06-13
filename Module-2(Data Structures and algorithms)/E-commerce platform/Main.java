import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products : ");
        int n = sc.nextInt();
        sc.nextLine();
        Product[] products = new Product[n];

        for(int i = 0; i < n; i++) {

            System.out.println("\nEnter Product " + (i + 1) + " Details");

            System.out.print("Enter product ID : ");
            int id = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter product Name : ");
            String name = sc.nextLine();

            System.out.print("Enter category : ");
            String category = sc.nextLine();

            products[i] = new Product(id, name, category);
        }

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(products[j].pName.compareToIgnoreCase
                (products[j + 1].pName) > 0) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
        System.out.print("\nEnter product name : ");
        String dartPoint = sc.nextLine();

        System.out.println("\n      LINEAR SEARCH         ");
        LinearSearch.search(products, dartPoint);

        System.out.println("\n      BINARY SEARCH         ");
        BinarySearch.search(products, dartPoint);
    }
}