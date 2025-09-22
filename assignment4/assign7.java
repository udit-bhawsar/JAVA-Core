import java.util.Scanner;

class Passenger{
int m,f,c,o;

void Detail(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of male passengers: ");
m = sc.nextInt();
System.out.print("Enter number of female passengers: ");
f = sc.nextInt();
System.out.print("Enter number of child passengers: ");
c = sc.nextInt();
System.out.print("Enter number of old aged passengers: ");
o = sc.nextInt();
}



}
class Q7{


public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter source: ");
String src = sc.nextLine();
System.out.print("Enter Destination: ");
String destination = sc.nextLine();
System.out.print("Enter Day: ");
String day = sc.nextLine();
System.out.print("Enter Date: ");
int date = sc.nextInt();

String d = day.toLowerCase();

if(d.equals("sunday") || d.equals("saturday")){
System.out.print("Not considered");
}
else{
System.out.println("Select vehicle type(1-3): ");
System.out.println("1. Train: ");
System.out.println("2. Bus: ");
System.out.println("3. Flight: ");
int mode = sc.nextInt();

Passenger obj = new Passenger();


switch(mode){

case 1:
System.out.println();
System.out.println("Passengers details for travelling in train: ");
obj.Detail();
System.out.println();
System.out.print("Enter fair for one passenger: ");
int tf = sc.nextInt();
System.out.println();
int mtamt = tf * obj.m;
int ftamt = tf * obj.f;
int ctamt = tf * obj.c;
double otamt = (tf * obj.o)/2; 
System.out.print("Toal fair with (senior citizen criteria): "+(mtamt + ftamt + ctamt + otamt)); 
break;

case 2:
System.out.println();
System.out.println("Passengers details for travelling in bus: ");
obj.Detail();
System.out.println();
System.out.print("Enter fair for one passenger: ");
int bf = sc.nextInt();
System.out.println();
int mbamt = bf * obj.m;
int fbamt = bf * obj.f;
int cbamt = bf * obj.c;
double obamt = (bf * obj.o)/2; 
System.out.print("Toal fair with (senior citizen criteria): "+(mbamt + fbamt + cbamt + obamt)); 
break;

case 3:
System.out.println();
System.out.println("Passengers details for travelling in flight: ");
obj.Detail();
System.out.println();
System.out.print("Enter fair for one passenger: ");
int ff = sc.nextInt();
System.out.println();
int mfamt = ff * obj.m;
int ffamt = ff * obj.f;
int cfamt = ff * obj.c;
double ofamt = (ff * obj.o)/2; 
System.out.print("Toal fair with (senior citizen criteria): "+(mfamt + ffamt + cfamt + ofamt)); 
break;

default : System.out.print("Invalid Input");







}


}

}
}