import java.util.Scanner;

    class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();

        double amount, result;

        result = (p >= 500) 
            ? ((p * Math.pow((1 + r / 100), t)) - p)  
            : ((p * r * t) / 100);                  

        System.out.println((p >= 500) 
            ? "Compound Interest = " + result 
            : "Simple Interest = " + result);
    }
}
