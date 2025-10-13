import java.util.Scanner;

class Program51 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Starting number  : ");
        int start = sc.nextInt();
        System.out.print("Enter any number greater than starting number : ");
        int end = sc.nextInt();

        while (start <= end) {
            int num = start;  
            int rev = 0;

            
            while (num > 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }

            System.out.print(rev + " ");
            start++;
        }
    }
}
