import java.util.Scanner;

class Q27{

void Fact(int n){
System.out.print("Facors: ");
for(int i=1;i<=n;i++){
if(n%i==0){
System.out.print(i+" ");
}
}

}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int n = sc.nextInt();

Q27 obj = new Q27();

obj.Fact(n);
}
}