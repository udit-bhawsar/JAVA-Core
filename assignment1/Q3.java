import java.util.Scanner;
class Q3{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);


System.out.print("Enter priciple Fehrenite: ");
double f = sc.nextInt();

double c = (f  - 32) * 5/9;
System.out.print("Celcius : "+c); 

}
}