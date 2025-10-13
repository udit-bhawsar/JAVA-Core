import java.util.Scanner;

class Program53 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter and Check Number is Strong or Not (start) : ");
        int start = sc.nextInt();
        System.out.print("Enter and Check Number is Strong or Not (end) : ");
        int end = sc.nextInt();

        while (start <= end) {
            int m = start;
            int sum = 0;
            int num = m;

            while (num > 0) {
                int rem = num % 10;
                int fact = 1;

                while (rem > 0) {
                    fact = fact * rem;
                    rem--;
                }

                sum = sum + fact;
                num = num / 10;
            }

            if (m == sum) {
                System.out.println(start + " is a Strong Number");
            }

            start++;
        }
    }
}
