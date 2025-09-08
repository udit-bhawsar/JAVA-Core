import java.util.Scanner;
class Q27{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value : ");
    int a = sc.nextInt();

    double convert  = a * 0.305;
    System.out.print(a + " Feet = " + convert + " meter");
}
}