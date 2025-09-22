import java.util.Scanner;

class Q36{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a four digit number: ");
int n = sc.nextInt();

int nc = 0;
int tn = n;

while(tn>0){
tn=tn/10;
nc++;
}



int r1 = n%10;
n=n/10;

int r2 = n%10;
n=n/10;

int r3 = n%10;
n=n/10;

int r4 = n%10;
n=n/10;


if(nc == 4){
int g1 = (r1 > r2) ? r1 : r2;
int g2 = (r3 > r4) ? r3 : r4;
int goat = (g1 > g2) ? g1 : g2;

int s1 = (r1 < r2) ? r1 : r2;
int s2 = (r3 < r4) ? r3 : r4;
int soat = (s1 < s2) ? s1 : s2;

System.out.println("Greatest digit between them: "+goat);
System.out.println("Smallest digit between them: "+soat);

}
else{
System.out.println("Enter only 4 digit number!!");
}



}
}