class BinarySearch {
    static void search(Product[] products, String dartPoint) {
        int left = 0;
        int right = products.length - 1;
        boolean found = false;
        while(left <= right) {
            int mid = (left + right) / 2;
            int result = dartPoint.compareToIgnoreCase(products[mid].pName);
            if(result == 0) {
                System.out.println("Product found");
                System.out.println("ID: " + products[mid].pId);
                System.out.println("Name: " + products[mid].pName);
                System.out.println("Category: " + products[mid].category);
                found = true;
                break;
            }
            else if(result > 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        if(!found) {
            System.out.println("Product not found");
        }
    }
}
