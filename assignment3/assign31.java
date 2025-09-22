import java.util.Scanner;

class Q31{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a five digit number: ");
int n = sc.nextInt();


int f1=n/10000;
int l1=n%10;


int m = n/10;
m = m%1000;


int f2=m/100;
int l2=m%10;

int mm=m%100;
mm = mm /10 ;




System.out.println("After replacing first and last digit: "+( (f1 * 10000) + (l2 * 1000) + (mm * 100) +  (f2 * 10) + (l1 * 1)));


}
}