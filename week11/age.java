void main() {
    int age = Integer.parseInt(IO.readln("Enter Your Age : "));
    if ((age <= 0) || (age > 120)) {
        IO.println("Error Input");
    } else if (age <= 9) {
        IO.println("Your age group is: Child");
    } else if (age <= 19) {
        IO.println("Your age group is: Teenager");
    } else if (age <= 59) {
        IO.println("Your age group is: Adult");
    } else if (age >= 60) {
        IO.println("Your age group is: Senior");
    }
}