import java.util.Scanner;
class Q3{
void checkChar(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a character: ");
char c = sc.next().charAt(0);
if(c>='a' && c<='z'){
System.out.print("Lower Case");
}
else{
System.out.print("Not Lower Case");
}

}
public static void main(String args[]){
Q3 obj = new Q3();


obj.checkChar();


}



}