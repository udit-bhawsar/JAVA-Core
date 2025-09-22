import java.util.*;

class Q32{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a two digit number: ");
int n = sc.nextInt();


int rounded = Math.round(n / 10.0f) * 10; 


System.out.println("Rounded off number: "+rounded );


}
}