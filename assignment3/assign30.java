import java.util.Scanner;

class Q30{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a five digit number: ");
int n = sc.nextInt();

int r1 = n%10;
n=n/10;
int r2 = n%10;
n=n/10;
int r3 = n%10;
n=n/10;
int r4 = n%10;
n=n/10;
int r5 = n%10;
n=n/10;


System.out.println("Reversed number: "+( (r1 * 10000) + (r2 * 1000) + (r3 * 100) +  (r4 * 10) + (r5 * 1)));


}
}
