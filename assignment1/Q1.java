import java.util.Scanner;
class Q1{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter number 1: ");
double a = sc.nextInt();
System.out.print("Enter number 2: ");
double b = sc.nextInt();
System.out.print("Enter number 3: ");
double c = sc.nextInt();
System.out.print("Enter number 4: ");
double d = sc.nextInt();
System.out.print("Enter number 5: ");
double e = sc.nextInt();


double avg = (a + b + c + d + e)/5;
System.out.print("Average : "+avg); 

}
}