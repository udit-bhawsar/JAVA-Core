import java.util.Scanner;

class Q14{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter number 1: ");
int a = sc.nextInt();
System.out.print("Enter number 2: ");
int b = sc.nextInt();


if(a%b==0){
System.out.print("1 number is divisible by 2 number");
}
else{
System.out.print("1 number is not divisible by 2 number");
}


}
}
