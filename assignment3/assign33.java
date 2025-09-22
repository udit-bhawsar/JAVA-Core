import java.util.*;

class Q33{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a three digit number: ");
int n = sc.nextInt();


int rounded = Math.round(n / 100.0f) * 100; 


System.out.println("Rounded off number: "+rounded );


}
}