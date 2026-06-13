class Orderblueprint {
    int Id;
    String Name;
    double totalPrice;

    Orderblueprint(int Id, String Name, double totalPrice) {

        this.Id = Id;
        this.Name = Name;
        this.totalPrice = totalPrice;
    }

    void display() {

        System.out.println(
            Id + " " +
            Name + " " +
            totalPrice
        );
    }
}