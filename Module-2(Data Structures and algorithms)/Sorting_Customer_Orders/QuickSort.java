class QuickSort {
    static int partition(Orderblueprint[] orders,int low,int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for(int j = low; j < high; j++) {
            if(orders[j].totalPrice < pivot) {
                i++;
                Orderblueprint temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Orderblueprint temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }
    static void quickSort(Orderblueprint[] orders,int low,int high) {
        if(low < high) {
            int pivotIndex =partition(orders, low, high);
            quickSort(orders,low,pivotIndex - 1);
            quickSort(orders,pivotIndex + 1,high);
        }
    }
}