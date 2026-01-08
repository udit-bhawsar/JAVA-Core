import java.util.Scanner;

class Q29{

void Febbo(int n,int a,int b){
int c;
System.out.print("Fibonacci series: "+a+" "+b+" ");
for(int i=3;i<=n;i++){
c = a+b;
System.out.print(c+" ");
a = b;
b = c;
}

}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int n = sc.nextInt();

Q29 obj = new Q29();
int a = 0;
int b = 1;
obj.Febbo(n,a,b);
}
}