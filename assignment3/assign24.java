import java.util.Scanner;

class Q24{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a three digit number: ");
int n = sc.nextInt();

int sum=0;
while(n>0){
int r=n%10;
sum = r + sum;
n = n/10;
}
System.out.println("Sum of all the individual digits is "+sum);


}
}
