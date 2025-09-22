import java.util.Scanner;

class Q16{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter number 1: ");
int a = sc.nextInt();
System.out.print("Enter number 2: ");
int b = sc.nextInt();
System.out.print("Enter number 3: ");
int c = sc.nextInt();


if(a>=b && a>=c){
System.out.print("Greater Number: "+a); 
}
else if(b>=a && b>=c){
System.out.print("Greater Number: "+b);
}
else if(c>=a && c>=b){
System.out.print("Greater Number: "+c);
}

if(a==b){
System.out.print("\n1 number is equals to 2");
}
else if(c==b){
System.out.print("\n2 number is equals to 3");
}
else if(c==a){
System.out.print("\n1 number is equals to 3");
}


}
}
