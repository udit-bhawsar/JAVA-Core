import java.util.Scanner;

class Q24{

int NatSum(int n){
int sum=0;
for(int i=1;i<=n;i++){
sum += i;
}
return sum;
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter N: ");
int n = sc.nextInt();

Q24 obj = new Q24();

System.out.print("Sum of first "+n+" natural numbers: "+obj.NatSum(n));
}
}