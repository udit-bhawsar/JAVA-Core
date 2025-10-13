import java.util.Scanner;

class Program44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;
        while (temp >= 10) {
            temp /= 10;
            count++;
        }

        int firstDigit = temp;
        int lastDigit = num % 10;
        int middlePart = (num % (int)Math.pow(10, count)) / 10;

        int result = lastDigit * (int)Math.pow(10, count) + middlePart * 10 + firstDigit;

        System.out.println("Number after swapping first and last digit: " + result);
    }
}
