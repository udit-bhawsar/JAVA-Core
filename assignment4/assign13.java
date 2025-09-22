import java.util.Scanner;
class Bill{
String name;
int totalbill;
Scanner sc = new Scanner(System.in);
   
Bill(String name, int totalbill){
this.name = name;
this.totalbill = totalbill;
}

void print(){
System.out.println("\nYour Total bill :" + totalbill);
System.out.println("Thankyou " + name + " Visit Again!");
}

}
class ColdDrink{
Scanner sc= new Scanner(System.in);
int coke;
int sprite;
int juice;

ColdDrink(int coke , int sprite ,int juice){
this.coke = coke;
this.sprite = sprite;
this.juice = juice;
}

int getColdDrink(){
System.out.println("\n -------Juice Menu-------");
System.out.println("1. Coke");
System.out.println("2. Sprite");
System.out.println("3. Juice");
System.out.println("4. Back Menu");
        
System.out.print("Enter Choice : ");
int pchoice = sc.nextInt();
System.out.print("Enter Quantity : ");
int Quantity = sc.nextInt();
       
switch(pchoice){
case 1:
return coke * Quantity;
              
case 2:
return sprite * Quantity;
              
case 3:
return juice * Quantity;

case 4:
return 0;

default:
System.out.println("Invalid");
return 0;

}
}
}

class Burger{
Scanner sc= new Scanner(System.in);
int Vegbuger;
int cheseburger;
int pattyburger;
 
Burger(int Vegbuger , int cheseburger ,int pattyburger){
this.Vegbuger = Vegbuger;
this.cheseburger = cheseburger;
this.pattyburger = pattyburger;
}

int getburger(){
System.out.println("\n -------Burger Menu-------");
System.out.println("1. Veg Burger");
System.out.println("2. Chese Burger");
System.out.println("3. Patty Buger");
System.out.println("4. Back Menu");
        
System.out.print("Enter Choice : ");
int pchoice = sc.nextInt();
System.out.print("Enter Quantity : ");
int Quantity = sc.nextInt();
        
switch(pchoice){
case 1:
return Vegbuger * Quantity;             

case 2:
return cheseburger * Quantity;

case 3:
return pattyburger * Quantity;

case 4:
return 0;

default:
System.out.println("Invalid");
return 0;
}

}
}
class Pizza{
Scanner sc= new Scanner(System.in);

int Margherita;
int Onion;
int Panner;
 
Pizza(int Margherita , int Onion ,int Panner){
this.Panner = Panner;
this.Onion = Onion;
this.Margherita = Margherita;
}

int getpizza(){
System.out.println("\n -------Pizza Menu-------");
System.out.println("1. Margherita Pizza");
System.out.println("2. Onion Pizza");
System.out.println("3. Panner Tikka Pizza");
System.out.println("4. Back Menu");
System.out.print("Enter Choice : ");
int pchoice = sc.nextInt();

System.out.print("Enter Quantity : ");
int Quantity = sc.nextInt();
        
switch(pchoice){
case 1:
return Margherita * Quantity;

case 2:
return Onion * Quantity;

case 3:
return Panner * Quantity;

case 4:
return 0;

default:
System.out.println("Invalid");
return 0;
}
}


}

class Q13{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
 
System.out.print("Enter your name : ");
String name = sc.nextLine();
int Margherita = 200;
int Panner = 150;
int Onion = 200;
int totalbill = 0;
int Vegbuger = 40;
int cheseburger = 60;
int pattyburger = 50;
int coke = 60;
int sprite = 80;
int juice = 40;


while(true){

System.out.println("\n------- JMB Menu -------- ");
System.out.println("1. Pizza");
System.out.println("2. Burger");
System.out.println("3. Cold Drinks");
System.out.println("4. Printing Bill");
   
System.out.print("Enter your Choice : ");
int mchoice = sc.nextInt();

switch(mchoice){
   
case 1:
Pizza pz = new Pizza(Margherita,Onion,Panner);
totalbill += pz.getpizza();
break;

case 2:
Burger bg = new Burger(Vegbuger,cheseburger,pattyburger);
totalbill += bg.getburger();
break;

case 3:
ColdDrink cd = new ColdDrink(coke,sprite,juice);
totalbill += cd.getColdDrink();
break;

case 4:
Bill bill = new Bill(name,totalbill);
bill.print();
return;

default:
System.out.print("Invalid Input");
        

}
}

}
}
