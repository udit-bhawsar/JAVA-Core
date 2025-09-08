import java.util.Scanner;
class Q4{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter priciple Celcius: ");
double c = sc.nextInt();

double f = (c * 9/5) + 32;
System.out.print("Fehrenite : "+f); 

}
}