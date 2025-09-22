import java.util.Scanner;

class Q27{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a six digit number: ");
int n = sc.nextInt();


int l=n/100000;
int f=n%10;
int sum = l + f;
System.out.println("the sum of first and last digit is "+sum);


}
}
