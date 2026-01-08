import java.util.Scanner;

class Q30{

void Even(int n){
System.out.print("Even numbers: ");
for(int i=1;i<=n*2;i++){
if(i%2==0){
System.out.print(i+" ");
}
}

}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter N: ");
int n = sc.nextInt();

Q30 obj = new Q30();

obj.Even(n);
}
}