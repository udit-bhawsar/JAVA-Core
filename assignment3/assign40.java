import java.util.Scanner;

class Q40{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a six digit number: ");
int n = sc.nextInt();

int temp = n;

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
int r6 = n%10;
n=n/10;

int nn =( (r1 * 100000) + (r2 * 10000) + (r3 * 1000) +  (r4 * 100) + (r5 * 10) + (r6 * 1));

System.out.println("Reversed number: "+( (r1 * 100000) + (r2 * 10000) + (r3 * 1000) +  (r4 * 100) + (r5 * 10) + (r6 * 1)));

if(temp==nn){
System.out.println("it is a Palindrome number");
}
else{

System.out.println("it is not a Palindrome number");
}


}
}
