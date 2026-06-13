import java.util.Scanner;

public class InventoryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\n-=-=-=- INVENTORY MENU -=-=-=");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Display Products");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    Product p = new Product(id,  name,  quantity,price);

                    inventory.addProduct(p);

                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();
                    inventory.searchProduct(id);
                    break;

                case 3:
                    System.out.print("Enter Product Id: ");
                    id = sc.nextInt();

                    System.out.print("Enter New Quantity: ");
                    quantity = sc.nextInt();

                    System.out.print("Enter New Price: ");
                    price = sc.nextDouble();

                    inventory.updateProduct( id, quantity,  price);
                    break;

                case 4:
                    System.out.print("Enter Product Id: ");
                    id = sc.nextInt();
                    inventory.deleteProduct(id);
                    break;

                case 5:
                    inventory.displayProducts();
                    break;

                case 6:
                  System.out.println("exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}