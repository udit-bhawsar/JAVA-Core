import java.util.Scanner;
class Q17{
void checkChar(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a Character: ");
char c = sc.next().charAt(0);

if(c>='0' && c<='9'){
System.out.print("Digit");
}
else if( (c>='a' && c<='z') || (c>='A' && c<='Z')){
System.out.print("Character");
}
else{
System.out.print("Special Character");
}

}
public static void main(String args[]){
Q17 obj = new Q17();


obj.checkChar();


}



}