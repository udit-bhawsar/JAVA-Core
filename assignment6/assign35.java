import java.util.Scanner;

class Q35{

void Perfect(int n){
int sum=0;
for(int i=1;i<=n/2;i++){
if(n%i==0){
sum += i;
}
}

if(sum == n){
System.out.print("It is a Perfect Number");
}
else{
System.out.print("It is not a Perfect Number");
}

}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int n = sc.nextInt();

Q35 obj = new Q35();

obj.Perfect(n);
}
}