import java.util.Scanner;

    class Program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        
        double sum = 0.0;
        
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        
        System.out.print(" " +  sum);
    }
}