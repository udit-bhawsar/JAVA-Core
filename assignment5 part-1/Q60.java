import java.util.Scanner;

class Program60 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int N = sc.nextInt();

        System.out.println("Number\tSquare\tCube\tSquare Root");

        for (int i = 1; i <= N; i++) {
            int square = i * i;
            int cube = i * i * i;
            double sqrt = Math.sqrt(i);

            System.out.println(i + "\t" + square + "\t" + cube + "\t" + String.format("%.2f", sqrt));
        }
    }
}
