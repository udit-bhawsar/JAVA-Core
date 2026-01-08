import java.util.Scanner;

class Q26{

void Fact(int n){
int p = 1;
for(int i=n;i>=1;i--){
p = p * i;
}
System.out.println("Factorial: "+p);
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int n = sc.nextInt();

Q26 obj = new Q26();

obj.Fact(n);
}
}