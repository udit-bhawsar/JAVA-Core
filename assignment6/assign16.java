import java.util.Scanner;

class Q16{

int Gnum(int a,int b){
return (a > b) ? a : b;
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter two numbers: ");
int a = sc.nextInt();
int b = sc.nextInt();

Q16 obj = new Q16();

if(a==b){
System.out.println("Both number are equal");
}
else{
System.out.println("Greatest number: "+obj.Gnum(a,b));
}

}
}