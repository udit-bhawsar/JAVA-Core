import java.util.Scanner;

    class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int weeks = (totalDays % 365) / 7;
        int days = (totalDays % 365) % 7;

        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
    }
}
