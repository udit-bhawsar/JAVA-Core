import java.util.Scanner;

class Program43 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.print("Enter a binary number: ");
int n = sc.nextInt();

int a = 0;
int p = 1;

while(n>0){
int r=n%10;
a = a + (r * p);
p = p * 2;
n=n/10;
}

System.out.print("Number: "+a);

 

       
}
}
