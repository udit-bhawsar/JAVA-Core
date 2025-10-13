import java.util.Scanner;

    class Program50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Palindrome numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            int num = i;
            int reverse = 0;

            while (num > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            if (reverse == i) {
                System.out.print(i + " ");
            }
        }
    }
}

