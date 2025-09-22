import java.util.Scanner;

class Q8{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

String med[] = {"Paracetamol", "Cough Syrup", "Vitamin C", "Antibiotic", "Relief Spray","Insulin", "cough tablet", "Thermometer", "Glucose", "Inhaler"};
double price[] = {10.2,50.6,6.8,2.5,5.8,120.0,40.0,4.45,70.34,30.8,45.56};


System.out.println("Are you (1). Retailer or (2). Whole-seller");
System.out.print("Enter your choice(1 or 2): ");
int who = sc.nextInt();

double total = 0;
System.out.println();
switch(who){

case 1 : 

System.out.println("----------Medicine details---------");
System.out.println();
System.out.println("------Name--------------price------");
for(int i=0;i<5;i++){
System.out.println((i+1)+". "+med[i]+"\t\t"+price[i]);
}
System.out.println();
System.out.print("Enter medicine number to purchase: ");
int rn = sc.nextInt();
System.out.print("Enter quantity( <= 5 because you are a retailer): ");
int rq = sc.nextInt();
System.out.println();
if(rq > 6){
System.out.print("Invalid Quantity!");
}
else{
total = price[rn - 1] * rq;
System.out.print("Total Bill: "+total);
}

break;


case 2 : 

System.out.println("----------Medicine details---------");
System.out.println();
System.out.println("------Name--------------price------");
for(int i=0;i<10;i++){
System.out.println((i+1)+". "+med[i]+"\t\t"+price[i]);
}
System.out.println();
System.out.print("Enter medicine number to purchase: ");
int wn = sc.nextInt();
System.out.print("Enter quantity( <= 5 because you are a retailer): ");
int wq = sc.nextInt();
System.out.println();
if(wq > 101){
System.out.print("Invalid Quantity!");
}
else{
total = price[wn - 1] * wq;
System.out.print("Total Bill : "+total);
}

break;





}

}
}