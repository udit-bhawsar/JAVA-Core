import java.util.*;

class Q42{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a  number of 1 to 4 digit: ");
int n = sc.nextInt();

int rounded = Math.round(n / 10.0f) * 10; 
System.out.println("Rounded off number: "+rounded );




}
}