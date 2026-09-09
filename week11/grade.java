void main() {
    int grade = Integer.parseInt(IO.readln("Enter Your Score : "));
    if ((grade < 0) || (grade > 100)) {
        IO.println("You must enter a correct score, try again later.");
    } else if (grade < 50) {
        IO.println("Your grade is: E");
    } else if (grade < 60) {
        IO.println("Your grade is: D");
    } else if (grade < 70) {
        IO.println("Your grade is: C");
    } else if (grade < 80) {
        IO.println("Your grade is: B");
    } else
        IO.println("Your grade is: A");

}