import java.util.Scanner;

class Program52 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        while (start <= end) {
            int m = start;   
            int num = m;     
            int sum = 0;

            while (num > 0) {
                int rem = num % 10;
                sum = sum + (rem * rem * rem);
                num = num / 10;
            }

            if (sum == m) {
                System.out.println(m + " is an Armstrong Number");
            }

            start++;
        }
    }
}
