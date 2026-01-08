
import java.util.Scanner;
import java.io.Console;

class Account {
    String name;
    int age;
    private String pass;

    String sname;
    int sage;
    int jamt;

    String nname;
    int nage;
    int namt;

    String cname;
    int cage;
    int camt;

    Account(String name, int age, String pass) {
        this.name = name;
        this.age = age;
        this.pass = pass;
    }

    void deposit() {
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        char[] passwordArray = console.readPassword("Enter your password: ");
        String pswd = new String(passwordArray);

        if (pass.equals(pswd)) {
            System.out.print("Enter amount to deposit: ");
            int amt = sc.nextInt();
            System.out.println("Deposit for which account: ");
            System.out.println("1. Joint Account");
            System.out.println("2. Saving Account");
            System.out.println("3. Child Account");
            System.out.print("Enter your choice(1-3): ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    jamt += amt;
                    System.out.println("Amount " + amt + " successfully deposited in Joint account");
                    break;

                case 2:
                    namt += amt;
                    System.out.println("Amount " + amt + " successfully deposited in Saving account");
                    break;

                case 3:
                    camt += amt;
                    System.out.println("Amount " + amt + " successfully deposited in Child account");
                    break;

                default:
                    System.out.println("Invalid Input");
            }

        } else {
            System.out.println("Incorrect password!");
        }

    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        char[] passwordArray = console.readPassword("Enter your password: ");
        String pswd = new String(passwordArray);

        if (pass.equals(pswd)) {
            System.out.print("Enter amount to Withdraw: ");
            int amt = sc.nextInt();
            System.out.println("Withdraw from which account ");
            System.out.println("1. Joint Account");
            System.out.println("2. Saving Account");
            System.out.println("3. Child Account");
            System.out.print("Enter your choice(1-3): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (amt <= jamt) {
                        jamt -= amt;
                        System.out.println("Amount " + amt + " withdrawn from Joint account");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 2:
                    if (amt <= namt) {
                        namt -= amt;
                        System.out.println("Amount " + amt + " withdrawn from Saving account");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 3:
                    if (amt <= camt) {
                        camt -= amt;
                        System.out.println("Amount " + amt + " withdrawn from Child account");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                default:
                    System.out.println("Enter correct choice");
            }
        } else {
            System.out.println("Incorrect password!");
        }

    }

    void display() {
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        char[] passwordArray = console.readPassword("Enter your password: ");
        String pswd = new String(passwordArray);
        if (pass.equals(pswd)) {
            System.out.println("\n--- Account Details ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Joint Balance: " + jamt);
            System.out.println("Saving Balance: " + namt);
            System.out.println("Child Balance: " + camt);
        } else {
            System.out.println("Incorrect password!");
        }
    }

    void deactivate() {
        jamt = namt = camt = 0;
        System.out.println("All accounts deactivated successfully.");
    }
}

class Q23 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        String name;
        int age;
        String gmail;

        if (console == null) {
            System.out.println("No console available. Run this program in terminal/command prompt.");
            return;
        }
        System.out.println("=======State Bank Of India==========");

        while (true) {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            if (name.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid input! Name should contain only alphabets. Try again.");
            }
        }

        while (true) {
            System.out.print("Enter your age: ");
            if (sc.hasNextInt()) { // check if input is an integer
                age = sc.nextInt();

                if (age > 18 && age < 200) { // reasonable age check
                    break; // valid, exit loop
                } else {
                    System.out.println("Invalid age! Age must be greater 18. Try again.");
                }
            } else {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.next(); // discard wrong input
            }
        }

        sc.nextLine();
        while (true) {
            System.out.print("Enter your Gmail address: ");
            gmail = sc.nextLine();

            // Regex: checks if input ends with @gmail.com and has valid characters before
            // it
            if (gmail.matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")) {
                System.out.println("Your Gmail is: " + gmail);
                break; // valid, exit loop
            } else {
                System.out.println("Invalid Gmail! Please enter a valid Gmail address. Try again.");
            }
        }

        char[] passwordArray = console.readPassword("Enter your password: ");
        String pass = new String(passwordArray);

        Account account = new Account(name, age, pass);

        System.out.println("Account opening options:- ");
        String accType[] = { "Joint Account", "Saving Account", "Child Account" };
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + accType[i]);
        }

        System.out.print("Enter your choice(1-3): ");
        int n = sc.nextInt();

        switch (n) {

            case 1:
                System.out.println();
                sc.nextLine();
                while (true) {
                    System.out.print("Enter your spouse name: ");
                    account.sname = sc.nextLine();
                    if (account.sname.matches("[a-zA-Z ]+")) {
                        break;
                    } else {
                        System.out.println("Invalid input! Name should contain only alphabets. Try again.");
                    }
                }

                while (true) {
                    System.out.print("Enter your spouse age: ");
                    if (sc.hasNextInt()) { // check if input is an integer
                        account.sage = sc.nextInt();

                        if (account.sage > 18 && account.sage < 200) { // reasonable age check
                            break; // valid, exit loop
                        } else {
                            System.out.println("Invalid age! Age must be greater than 18. Try again.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter numbers only.");
                        sc.next(); // discard wrong input
                    }
                }
                account.jamt = 5000;
                break;

            case 2:
                System.out.println();
                sc.nextLine();
                while (true) {
                    System.out.print("Enter your nominee name: ");
                    account.nname = sc.nextLine();
                    if (account.nname.matches("[a-zA-Z ]+")) {
                        break;
                    } else {
                        System.out.println("Invalid input! Name should contain only alphabets. Try again.");
                    }
                }

                while (true) {
                    System.out.print("Enter your nominee age: ");
                    if (sc.hasNextInt()) { // check if input is an integer
                        account.nage = sc.nextInt();

                        if (account.nage > 0 && account.nage < 200) { // reasonable age check
                            break; // valid, exit loop
                        } else {
                            System.out.println("Invalid age! Age must be greater than 0. Try again.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter numbers only.");
                        sc.next(); // discard wrong input
                    }
                }
                account.namt = 2000;
                break;

            case 3:
                System.out.println();
                sc.nextLine();
                while (true) {
                    System.out.print("Enter child name: ");
                    account.cname = sc.nextLine();
                    if (account.cname.matches("[a-zA-Z ]+")) {
                        break;
                    } else {
                        System.out.println("Invalid input! Name should contain only alphabets. Try again.");
                    }
                }

                while (true) {
                    System.out.print("Enter age of parent/guardian: ");
                    if (sc.hasNextInt()) { // check if input is an integer
                        account.cage = sc.nextInt();

                        if (account.cage > 0 && account.cage < 200) { // reasonable age check
                            break; // valid, exit loop
                        } else {
                            System.out.println("Invalid age! Age must be greater than 0. Try again.");
                        }
                    } else {
                        System.out.println("Invalid input! Please enter numbers only.");
                        sc.next(); // discard wrong input
                    }
                }
                account.camt = 1000;
                break;

            default:
                System.out.println("Give valid input ");
                break;
        }

        while (true) {
            System.out.println();
            System.out.println("Enter 1. Deposit ");
            System.out.println("Enter 2. Withdraw ");
            System.out.println("Enter 3. Display detail ");
            System.out.println("Enter 4. Deactivate account ");
            System.out.println("Enter 5. Exit ");
            System.out.print("Enter your choice(1-5): ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println();
                    account.deposit();
                    break;

                case 2:
                    System.out.println();
                    account.withdraw();
                    break;

                case 3:
                    System.out.println();
                    account.display();
                    break;

                case 4:
                    System.out.println();
                    account.deactivate();
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Exiting Menu....");
                    return;

                default:
                    System.out.println();
                    System.out.println("Invalid Input");
            }
        }

    }
}
