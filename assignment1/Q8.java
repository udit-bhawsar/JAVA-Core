 import java.util.Scanner;
class Q8{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter Principle Amount: ");
double p = sc.nextInt();
System.out.print("Enter Rate: ");
double r = sc.nextInt();
System.out.print("Enter year: ");
double t = sc.nextInt();



double ci = (Math.pow(1+r/100,t) * p ) - p;


System.out.print("Compound Interest: " + ci);

}

}