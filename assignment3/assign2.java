import java.util.Scanner;
class Q2{
void checkChar(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a character: ");
char c = sc.next().charAt(0);
if(c>='A' && c<='Z'){
System.out.print("Upper Case");
}
else{
System.out.print("Not Upper Case");
}

}
public static void main(String args[]){
Q2 obj = new Q2();


obj.checkChar();


}



}