import java.util.Scanner;

class Q16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Character : ");
        char s = sc.next().charAt(0);

        String res = (s >= 'a' && s <= 'z')? "LowerCase" : "UpperCase";

        System.out.print(res);
    }
}