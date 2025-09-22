import java.util.Scanner;
class Q4{
void checkChar(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a character: ");
char c = sc.next().charAt(0);
if( (c>='a' && c<='z') || (c>='A' && c<='Z') ){
System.out.print("Alphabet");
}
else{
System.out.print("Not Alphabet");
}

}
public static void main(String args[]){
Q4 obj = new Q4();


obj.checkChar();


}



}