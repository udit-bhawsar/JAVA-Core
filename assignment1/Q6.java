import java.util.Scanner;
class Q6{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter integer a: ");
double a = sc.nextInt();
System.out.print("Enter integer b: ");
double b = sc.nextInt();


a = a + b;
b = a - b;
a = a - b;

System.out.println("Swapped value of a: "+a); 
System.out.println("Swapped value of b: "+b); 

}
}