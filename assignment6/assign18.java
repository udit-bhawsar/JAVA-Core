import java.util.Scanner;

class Q18{

int Gnum(int a,int b,int c){
return (a > b) ? ( (a > c) ? a : c ) : ( (b > c) ? b : c );
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter three numbers: ");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

Q18 obj = new Q18();


System.out.println("Greatest number: "+obj.Gnum(a,b,c));


}
}