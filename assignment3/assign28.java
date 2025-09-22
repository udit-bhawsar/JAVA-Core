import java.util.Scanner;

class Q28{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a five digit number: ");
int n = sc.nextInt();


int f=n/10000;
int l=n%10;


int m = n/10;
m = m%1000;




System.out.println("After replacing first and last digit: "+(l * 10000 + (m * 10 ) + f));


}
}
