import java.util.Scanner;

class Q18{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter year: ");
int a = sc.nextInt();

if(a%100==0){
if(a%400==0){
System.out.print("Leap year");
}
else{
System.out.print("Not Leap year");
}
}
else if(a%4==0){
System.out.print("Leap year");
}
else{
System.out.print("Not Leap year");
}

}
}
