import java.util.Scanner;

class Q39 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

System.out.print("a. y=x-2 +3*x-7 ");
System.out.print("\nEnter value of x: ");
int x = sc.nextInt();
int y = x - 2 + 3 * x - 7;
System.out.println("Value of y = " + y);
System.out.println();

System.out.print("b. y=x++ + ++x ");
System.out.print("\nEnter value of x: ");
x = sc.nextInt();
y = x++ + ++x;
System.out.println("Value of x = " + x);
System.out.println("Value of y = " + y);
System.out.println();

System.out.print("c. z= x++ - --y - --x + x++ ");
System.out.print("\nEnter values of x and y: ");
x = sc.nextInt();
y = sc.nextInt();
int z = x++ - --y - --x + x++;
System.out.println("Value of x = " + x);
System.out.println("Value of y = " + y);
System.out.println("Value of z = " + z);
System.out.println();


System.out.print("d. z = x && y || !(x||y) ");
System.out.print("\nd) Enter boolean values (true/false) for x and y: ");
boolean bx = sc.nextBoolean();
boolean by = sc.nextBoolean();
boolean bz = (bx && by) || !(bx || by);
System.out.println("Value of z = " + bz);
}
}
