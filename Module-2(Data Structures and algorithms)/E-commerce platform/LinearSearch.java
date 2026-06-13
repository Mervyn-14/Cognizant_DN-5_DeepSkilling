class LinearSearch {
    static void search(Product[] products, String dartPoint) {
        boolean found = false;
        for(int i = 0; i < products.length; i++) {
            if(products[i].pName.equalsIgnoreCase(dartPoint)) {
                System.out.println("Product found");
                System.out.println("ID: " + products[i].pId);
                System.out.println("Name: " + products[i].pName);
                System.out.println("Category: " + products[i].category);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Product not found");
        }
    }
}