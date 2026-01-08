import java.util.Scanner;

class Q15{


void temp(int f){

double c = (f - 32) * 5 / 9;
System.out.print("Temperature in Celcius: "+c);
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter temprature in Fahrenheit: ");
int f = sc.nextInt();

Q15 obj = new Q15();

obj.temp(f);


}

}