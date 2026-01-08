import java.util.Scanner;

class Program84 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        char ch = (char) (96 + 1);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }
                ch++;
            }
            System.out.println();
        }
        for (int i = 1; i < n + 1; i++) {
            System.out.print(ch);
            ch++;
        }
    }
}