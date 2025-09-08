import java.util.Scanner;
class Q17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Character : ");
        char s = sc.next().charAt(0);

        String res = (s >= 'A' && s <= 'Z' || s >= 'A' && s <= 'Z' )? "Alphabet" : "NotAlphabet";

        System.out.print(res);
    }
}