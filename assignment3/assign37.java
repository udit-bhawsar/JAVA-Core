import java.util.Scanner;

class Q37{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter last month unit: ");
int lunit = sc.nextInt();
System.out.print("Enter current month unit: ");
int cunit = sc.nextInt();


int unit = cunit - lunit;
System.out.println("Total unit: "+unit);
int amt= 0;

if(unit >= 0 && unit <=100){
amt = unit * 2; 
System.out.println("Total amount: "+amt);
} 
else if (unit >= 101 && unit <= 200){
amt = 200 + ((unit % 100) * 3) ;
System.out.println("Total amount: "+amt);
}
else if (unit >= 201 && unit <= 300){
amt = 200 + 300 + ((unit % 200) * 4) ;
System.out.println("Total amount: "+amt);
}
else{
int u = unit - 300;
amt = 200 + 300 + 400 + (u * 5 ) ;
System.out.println("Total amount: "+amt);
}






}
}