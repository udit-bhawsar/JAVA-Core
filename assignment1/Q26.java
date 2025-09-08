import java.util.Scanner;
class Q26{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value : ");
    int a = sc.nextInt();

    double convert  = a * 3.28084;
    System.out.print(a + " meter = " + convert + " Feet");
}
}