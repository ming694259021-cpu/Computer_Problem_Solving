void main() {
    int num1 = Integer.parseInt(IO.readln("Enter number 1 :"));
    int num2 = Integer.parseInt(IO.readln("Enter number 2 :"));
    IO.println("Current -> number 1 = " + num1 + " and number 2 = " + num2);

    int swap = num1;
    num1 = num2;
    num2 = swap;

    IO.println("Swapping...............");
    IO.println("Now -> number 1 = " + num1 + " and number 2 = " + num2);
}