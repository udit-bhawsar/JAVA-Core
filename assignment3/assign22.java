import java.util.Scanner;

class Q22{

void discountC(){
Scanner sc = new Scanner(System.in);
double pricec = 456.56;
System.out.print("You have coupon or not [Y or N] ");
char c = sc.next().charAt(0);
if(c=='y' || c=='Y'){
double dprice = pricec * 0.93;
System.out.println("Your final price after applying coupon: "+dprice);
}
else{
System.out.println("Your final price is: "+pricec);
}
}



void discountF(){
Scanner sc = new Scanner(System.in);
double pricef = 460.60;
System.out.print("You have coupon or not [Y or N] ");
char c = sc.next().charAt(0);
if(c=='y' || c=='Y'){
double dprice = pricef * 0.93;
System.out.print("Your final price after applying coupon: "+dprice);
}
else{
System.out.print("Your final price is: "+pricef);
}
}



public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Q22 obj = new Q22();

System.out.print("Enter [Y or N] for renting a car: ");
char r = sc.next().charAt(0);

double pricec = 456.56;
double pricef = 460.50;

if(r=='y' || r=='Y'){
System.out.print("Enter C/c for Compact or F/f for Full-size: ");
char v = sc.next().charAt(0);
if(v=='c' || v=='C'){
System.out.println("You selected compact"+"\nThe price for Compact Car is "+pricec);
obj.discountC();
}
else if(v=='f' || v=='F'){
System.out.println("You selected Full-size"+"\nThe price for Full Size Car is "+pricef);
obj.discountF();
}
else{
System.out.print("Invalid");
}
}
else{
System.out.print("Ok");
}




}
}
