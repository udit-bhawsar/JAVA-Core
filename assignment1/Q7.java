import java.util.Scanner;
class Q7{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter radius of the cylinder: ");
double r = sc.nextInt();
System.out.print("Enter height of the cylinder: ");
double h = sc.nextInt();

double v = Math.PI * r * r * h;

System.out.println("Volume of the cylinder: "+v); 

}
}