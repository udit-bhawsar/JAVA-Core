import java.util.Scanner;
class Q25{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value : ");
    int a = sc.nextInt();

    double convert  = a * 2.54;
    System.out.print(a + " inches = " + convert + " centemeter");
}
}