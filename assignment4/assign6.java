import java.util.Scanner;

class Q6{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int total = 0;

while(true){

System.out.println();
System.out.println("Enter 1-5 to add a specific item and 6 for exit: ");
System.out.println("1. Tyre: ");
System.out.println("2. Bolt: ");
System.out.println("3. Side Mirror: ");
System.out.println("4. Seat Cover: ");
System.out.println("5. Engine Oil (1 litre)");
System.out.println("6. Exit: ");
System.out.println();
System.out.print("Enter your choice: ");
int c = sc.nextInt();

switch(c){

case 1 : 
System.out.println();
System.out.print("Enter quantity of tyre: ");
int tq = sc.nextInt();
System.out.print("Enter price of tyre: ");
int tp = sc.nextInt();
tp = tp * tq;
total +=tp;
break;

case 2 : 
System.out.println();
System.out.print("Enter quantity of bolt: ");
int bq = sc.nextInt();
System.out.print("Enter price of bolt: ");
int bp = sc.nextInt();
bp = bq * bp;
total +=bp;
break;

case 3 : 
System.out.println();
System.out.print("Enter quantity of side mirror: ");
int sq = sc.nextInt();
System.out.print("Enter price of side mirror: ");
int sp = sc.nextInt();
sp = sq * sp;
total +=sp;
break;

case 4 : 
System.out.println();
System.out.print("Enter quantity of seat cover: ");
int cq = sc.nextInt();
System.out.print("Enter price of seat cover: ");
int cp = sc.nextInt();
cp = cq * cp;
total +=cp;
break;

case 5 : 
System.out.println();
System.out.print("Enter quantity of engine oil (1L): ");
int oq = sc.nextInt();
System.out.print("Enter price of (1L) Engine oil: ");
int op = sc.nextInt();
op = oq * op;
total +=op;
break;

case 6: 
System.out.println();
System.out.println("Total amount: "+total);
System.out.print("Thank you!");
return;


default : 
System.out.println();
System.out.print("Invalid Input");
}
}


}
}