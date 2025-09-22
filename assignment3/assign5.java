import java.util.Scanner;
class Q5{
void checkDigit(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
char c = sc.next().charAt(0);

if(c>='0' && c<='9'){
System.out.print("Digit");
}
else{
System.out.print("Not Digit");
}

}
public static void main(String args[]){
Q5 obj = new Q5();


obj.checkDigit();


}



}