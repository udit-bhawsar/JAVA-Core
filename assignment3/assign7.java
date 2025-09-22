import java.util.Scanner;

class Q7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any Character : ");
        char s = sc.next().charAt(0);

        String res = ( s >= 'A' && s <= 'Z' ) ? "UpperCase" + "\nConvered into lower case : "+Character.toLowerCase(s) : "Not upper case";

        System.out.print(res);
    }
}