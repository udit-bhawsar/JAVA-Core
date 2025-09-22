import java.util.Scanner;

class Q35{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a four digit number: ");
int n = sc.nextInt();

int sum=0;
while(n>0){
int r = n%10;
sum = sum + r;
n=n/10;
}
if(sum>9){
System.out.println("The sum is more than 9 : "+sum);
int tsum=0;
while(sum>0){
int r = sum%10;
tsum = tsum + r;
sum=sum/10;
} 
System.out.println("Again Sum: "+tsum);
}
else{
System.out.println("Sum: "+sum);
}


}
}