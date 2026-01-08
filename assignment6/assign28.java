import java.util.Scanner;

class Q28{

void Prime(int n){
int count = 0;
for(int i=2;i<=n;i++){
if(n%i==0){
count++;
}
}

if(count == 1){
System.out.print("It is a Prime number");
}
else{
System.out.print("It is not a Prime number");
}

}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int n = sc.nextInt();

Q28 obj = new Q28();

obj.Prime(n);
}
}