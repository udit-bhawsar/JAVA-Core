import java.util.Scanner;

class Q41{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter three digit number: ");
int n = sc.nextInt();
int temp = n;

int n1 = n%10;
n=n/10;
int n2 = n%10;
n=n/10;
int n3 = n%10;
n=n/10;

double sum = Math.pow(n1,3) + Math.pow(n2,3) + Math.pow(n3,3);

if(temp == sum){
System.out.println("It is a Armstrong Number");
}
else{
System.out.println("It is not a Armstrong Number");
}





}
}