import java.util.Scanner;

class Q33{

void Print(int n){
System.out.print("Series: ");
for(int i=1;i<=n;i++){
System.out.print((char)(64+i)+" ");
}


}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int n = sc.nextInt();

Q33 obj = new Q33();

obj.Print(n);
}
}