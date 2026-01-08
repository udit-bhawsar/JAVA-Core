import java.util.Scanner;

class Q14{

void simpleInterest(double a,double b,double c){

double si = (a * b * c) / 100; 
System.out.println("Simple Interest: "+si);
}


public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter principal amount: ");
double p = sc.nextInt();
System.out.print("Enter time: ");
double t = sc.nextInt();
System.out.print("Enter rate: ");
double r = sc.nextInt();

Q14 obj = new Q14();

obj.simpleInterest(p,r,t);
}
}