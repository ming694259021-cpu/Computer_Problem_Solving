void main() {
    int age = Integer.parseInt(IO.readln("Enter Your Age : "));
    if ((1 > age) || (age > 120)) {
        IO.println("Error Input");
    } else if (age > 59) {
        IO.println("Your age group is: Senior");
    } else if (age > 19) {
        IO.println("Your age group is: Adult");
    } else if (age > 9) {
        IO.println("Your age group is: Teenager");
    } else if (age > 0) {
        IO.println("Your age group is: Child");
    }
}