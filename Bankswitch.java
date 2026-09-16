void main() {
    double balance = 10000.0;
    int pin = Integer.parseInt(IO.readln("Enter your PIN : "));
    if (pin == 1234) {
        IO.println("===== ATM MENU =====");
        IO.println("1. Check balance");
        IO.println("2. Withdraw money");
        IO.println("3. Deposit money");
        IO.println("4. Exit");
        int choise = Integer.parseInt(IO.readln("Enter the number : "));

        switch (choise) {
            case 1:
                IO.println("Your balance is " + balance + " baht.");
                break;
            case 2:
                double withdarw = Double.parseDouble(IO.readln("Enter your withdarw : "));
                if (balance >= withdarw) {
                    balance = balance - withdarw;
                    IO.println("Withdraw successful.");
                    IO.println("Your balance is " + balance + " baht.");
                } else {
                    IO.println("Insufficient funds.");
                }
                break;
            case 3:
                double deposit = Double.parseDouble(IO.readln("Enter your deposit : "));
                if (deposit <= 0) {
                    IO.println("The amount must be greater than 0.");
                } else {
                    balance = balance + deposit;
                    IO.println("Deposit successful.");
                    IO.println("Your balance is " + balance + " baht.");
                }
                break;
            case 4:
                IO.println("Thank you for using the ATM.");
                break;
            default:
                IO.println("Invalid option.");

        }
    } else {
        IO.println("Incorrect PIN.");
    }

}