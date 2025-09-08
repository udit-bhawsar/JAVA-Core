import java.util.Scanner;

class Q32{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter value of a : ");
int a = sc.nextInt();

System.out.print("Enter value of b : ");
int b = sc.nextInt();
           
int abs = Math.abs(a-b);
int max = (a+b+abs)/2;
int min = (a+b-abs)/2;
        
System.out.println("Smallest Number: "+min);
System.out.println("Greatest Number: "+max);

}  
}