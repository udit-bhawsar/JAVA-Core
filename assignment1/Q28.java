import java.util.Scanner;
class Q28{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value : ");
    int a = sc.nextInt();

    double convert  = a * 0.0394;
    System.out.print(a + " mm = " + convert + " inch");
}
}