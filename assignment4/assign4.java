import java.util.Scanner;

class Q4{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a: ");
double a = sc.nextInt();
System.out.print("Enter b: ");
double b = sc.nextInt();
System.out.print("Enter operator: ");
char ch = sc.next().charAt(0);


switch(ch){

case '+' : System.out.print("Addition: "+(a+b));
break;
case '-' : System.out.print("Substraction: "+(a-b));
break;
case '*' : System.out.print("Multiplication: "+(a*b));
break;
case '/' : System.out.print("Division: "+(a/b));
break;
case '%' : System.out.print("Modulus: "+(a%b));
break;
default : System.out.print("Invalid operator");




}




}
}