import java.util.Scanner;

class Program57 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        while (start <= end) {
            int count = 0;

            if (start > 1) {
                for (int i = 2; i < start; i++) {
                    if (start % i == 0) {
                        count++;
                        break;
                    }
                }

                if (count == 0) {
                    System.out.print(start + " ");
                }
            }

            start++;
        }
    }
}
