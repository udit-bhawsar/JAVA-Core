import java.util.Scanner;

class GmailInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gmail;

        while (true) {
            System.out.print("Enter your Gmail address: ");
            gmail = sc.nextLine();

            // Regex: checks if input ends with @gmail.com and has valid characters before it
            if (gmail.matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$")) {
                System.out.println("Your Gmail is: " + gmail);
                break; // valid, exit loop
            } else {
                System.out.println("Invalid Gmail! Please enter a valid Gmail address. Try again.");
            }
        }
    }
}

