import java.util.Scanner;

class Q17{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter two numbers: ");
int a = sc.nextInt();
int b = sc.nextInt();

int g = (a > b) ? a : b;

System.out.println("Greatest number: "+g);

}
}