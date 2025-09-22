import java.util.Scanner;

class Home{
Scanner sc = new Scanner(System.in);

String name;
int age;
int Adhaar;
int _1BHK = 8000;
int _2BHK = 12000;
int _3BHK = 18000;
int _1RK = 5000;
int time;

Home(String name,int age,int Adhaar){
this.name = name;
this.age = age;
this.Adhaar = Adhaar;
}
void getdata(){
System.out.println("Type of Home Which one you want :");
System.out.println("1. 1BHK");
System.out.println("2. 2BHK");
System.out.println("3. 3BHK");
System.out.println("4. 1RK");
 
System.out.print("Enter choice number: ");
int choice = sc.nextInt();

System.out.print("Enter Time for(1/2/3...) Months : ");
time = sc.nextInt();

switch(choice){
case 1:
System.out.print("You choose 1BHK for " + time + " months Your rent is :" + (_1BHK * time));
break;

case 2:
System.out.print("You choose 2BHK for " + time + " months Your rent is :" +  (_2BHK * time));
break;

case 3:
System.out.print("You choose 3BHK for " + time + " months Your rent is :" + (_3BHK * time));
break;

case 4:
System.out.print("You choose 1RK for " + time + " months Your rent is :" + (_1RK * time));
break;

default:
System.out.print("Invalid Home type");
                
}
        

}

}
class Vehicle {
Scanner sc = new Scanner(System.in);
String name;
int age;
int Adhaar;
int bike = 300;   
int car = 800;   
int scooty = 200; 
int days;

Vehicle(String name, int age, int Adhaar) {
this.name = name;
this.age = age;
this.Adhaar = Adhaar;
}

void getdata() {
System.out.println("\n----- Vehicle Rent Menu -----");
System.out.println("1. Bike (300/day)");
System.out.println("2. Car (800/day)");
System.out.println("3. Scooty (200/day)");

System.out.print("Enter choice number : ");
int choice = sc.nextInt();

System.out.print("Enter Time for (1/2/3...) Days : ");
days = sc.nextInt();

switch (choice) {
case 1:
System.out.println("You choose Bike for " + days + " days. Your rent is: " + (bike * days));
break;

case 2:
System.out.println("You choose Car for " + days + " days. Your rent is: " + (car * days));
break;

case 3:
System.out.println("You choose Scooty for " + days + " days. Your rent is: " + (scooty * days));
break;

default:
System.out.println("Invalid Vehicle type");
}

}
}

class Q12{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);

System.out.print("Enter your name : ");
String name = sc.nextLine();
System.out.print("Enter your age : ");
int age = sc.nextInt();
System.out.print("Enter your Aadhar Number : ");
int Adhaar = sc.nextInt();

System.out.println();
System.out.println("------------- Booking ----------- : ");
System.out.println("1. Home Rent");
System.out.println("2. Vehicle Rent");
System.out.print("Enter(1 or 2): ");
int Renttype = sc.nextInt();
 
switch(Renttype){
case 1:
System.out.println();
Home hm = new Home(name , age , Adhaar);
hm.getdata();
break;

case 2:
System.out.println();
Vehicle vh = new Vehicle(name , age , Adhaar);
vh.getdata();
break;

default: 
System.out.println("Invalid Input");

}

}
}
