import java.util.HashMap;

public class Inventory {
     HashMap<Integer, Product> products =new HashMap<>();

    public void addProduct(Product p) {
        products.put(p.productId, p);
        System.out.println("Product Added Successfully.");
    }

    public void searchProduct(int id) {
        Product p = products.get(id);
        if(p != null) {
            System.out.println("\nProduct Found:");
            System.out.println(p);
        }
        else 
            System.out.println("Product Not Found.");
        
    }

    public void updateProduct(int id,int quantity,double price) {
        Product p = products.get(id);
        if(p != null) {
            p.quantity = quantity;
            p.price = price;
            System.out.println( "Product Updated Successfully.");
        }
        else 
            System.out.println("Product Not Found.");
        
    }

    public void deleteProduct(int id) {
        if(products.remove(id) != null) 
            System.out.println("Product Deleted Successfully.");
        
        else 
            System.out.println( "Product Not Found.");
        
    }

    public void displayProducts() {
        if(products.isEmpty()) {
            System.out.println( "Inventory is Empty.");
            return;
        }
        System.out.println("\n INVENTORY is here........");

        for(Product p :products.values()) {
            System.out.println(p);
        }
    }
}
