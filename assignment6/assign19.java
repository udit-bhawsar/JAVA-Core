import java.util.Scanner;

class Q19{

void LeapYear(int a){

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

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter year: ");
int n = sc.nextInt();

Q19 obj = new Q19();


obj.LeapYear(n);


}
}