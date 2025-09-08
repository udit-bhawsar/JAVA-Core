import java.util.Scanner;
class Q9{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter Side 1: ");
double a = sc.nextInt();
System.out.print("Enter Side 2: ");
double b = sc.nextInt();
System.out.print("Enter Side 3: ");
double c = sc.nextInt();

double s  = (a + b + c) / 2;

double area = Math.sqrt(s * (s-a) * (s-b) * (s-c) );
System.out.print("Area of the Triangle : "+area);
}
}