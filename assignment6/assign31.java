import java.util.Scanner;

class Q31{

void Print(int n){
System.out.print("Series: ");
int res = 0;
for(int i=0;i<n;i++){
res = (res * 10 + 1);
System.out.print(res+"+");
}


}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int n = sc.nextInt();

Q31 obj = new Q31();

obj.Print(n);
}
}