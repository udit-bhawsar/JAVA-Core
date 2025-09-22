import java.util.Scanner;

class Q34{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a five digit number: ");
int n = sc.nextInt();


int ec = 0;
int oc = 0;
while(n>0){
int r = n%10;
if(r%2==0){
ec++;
}
else{
oc++;
}
n=n/10;
}


System.out.println("Even count: "+ec);
System.out.println("Odd count: "+oc);


}
}