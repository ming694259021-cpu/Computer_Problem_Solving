void main() {
    double pay = Double.parseDouble(IO.readln("Enter the price of the product (per unit) :"));
    int amount = Integer.parseInt(IO.readln("Enter the quantity :"));
    double total = pay * amount;
    if (amount > 10.0) {
        double discount = total * 90.0 / 100.0;
        IO.println("You get a 10% dicount!");
        IO.println("Total price: " + discount + " Baht");
    } else {
        IO.println("Total price: " + total + " Baht");
    }
}