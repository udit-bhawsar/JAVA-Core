import java.util.Scanner;

class Q29{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter your basic salary: ");
double bs = sc.nextInt();

double da = 500;
double ta = bs * 0.10; 
double pf = bs * 7.8/100 ; 

double gs = bs + da + ta;
double ns = gs - pf;
System.out.println("Gross Salary: "+gs);
System.out.println("Net Salary: "+ns);


}
}
