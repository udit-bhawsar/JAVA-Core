import java.util.Scanner;

class Q13 {

    void avg(double a) {
        double avg = a / 5;
        System.out.print("Average: " + avg);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[5];

        double sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            num[i] = sc.nextInt();
            sum = sum + num[i];
        }

        Q13 obj = new Q13();

        obj.avg(sum);

    }

}