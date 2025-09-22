import java.util.Scanner;

class Q23{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter amount: ");
int amt = sc.nextInt();

int note1000 = amt/1000;
amt = amt % 1000;

int note500 = amt/500;
amt = amt % 500;

int note100 = amt/100;
amt = amt % 100;

int note50 = amt/50;
amt = amt % 50;

int note20 = amt/20;
amt = amt % 20;

int note10 = amt/10;
amt = amt % 10;

int note5 = amt/5;
amt = amt % 5;

int note2 = amt/2;
amt = amt % 2;

int note1 = amt/1;
amt = amt % 1;


System.out.println("Note 1000: "+note1000);
System.out.println("Note 500: "+note500);
System.out.println("Note 100: "+note100);
System.out.println("Note 50: "+note50);
System.out.println("Note 20: "+note20);
System.out.println("Note 10: "+note10);
System.out.println("Note 5: "+note5);
System.out.println("Note 2: "+note2);
System.out.println("Note 1: "+note1);








}
}
