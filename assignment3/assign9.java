import java.util.Scanner;
class Q9{


void checkDigit(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
char c = sc.next().charAt(0);

if(c>='0' && c<='9'){
System.out.print("*");

}
else{
System.out.print("Not Digit");
}

}
public static void main(String args[]){
Q9 obj = new Q9();


obj.checkDigit();


}



}