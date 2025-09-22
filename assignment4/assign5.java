import java.util.Scanner;

class Q5{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter (1-4) to find: ");
System.out.println("1. Area of circle: ");
System.out.println("2. Area of square: ");
System.out.println("3. Area of rectangle: ");
System.out.println("4. Area of trapezium: ");
System.out.print("Enter your choice(1-4): ");
int c = sc.nextInt();

switch(c){

case 1 : 
System.out.print("Enter radius: ");
int r = sc.nextInt(); 
double c_area = Math.PI * r * r;
System.out.print("Area of circle: "+c_area);
break;

case 2 : 
System.out.print("Enter side: ");
int s = sc.nextInt(); 
double s_area = s * s;
System.out.print("Area of Square: "+s_area);
break;

case 3 : 
System.out.print("Enter Length: ");
int l = sc.nextInt(); 
System.out.print("Enter breadth: ");
int b = sc.nextInt(); 
double r_area = l * b;
System.out.print("Area of rectangle "+r_area);
break;

case 4 : 
System.out.print("Enter Side 1: ");
int s1 = sc.nextInt(); 
System.out.print("Enter Side 2: ");
int s2 = sc.nextInt(); 
System.out.print("Enter height: ");
int h = sc.nextInt(); 
double t_area = 0.5 * (s1 + s2) + h;
System.out.print("Area of trapezium: "+t_area);
break;

default : System.out.print("Invalid Input");



}




}
}