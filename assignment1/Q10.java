import java.util.Scanner;
class Q10{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter number 1: ");
double a = sc.nextInt();
System.out.print("Enter number 2: ");
double b = sc.nextInt();

System.out.print("Enter operator: ");
char o = sc.next().charAt(0);


switch(o){

case '+' : System.out.print("Sum: "+(a+b));
break;
case '-' : System.out.print("Sum: "+(a-b));
break;
case '*' : System.out.print("Sum: "+(a*b));
break;
case '/' : System.out.print("Sum: "+(a/b));
break;

} 
}
}