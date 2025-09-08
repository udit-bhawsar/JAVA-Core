import java.util.Scanner;

class Q21{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        String res = (a>b)? "a is greater than b": "b is greater than a";

       System.out.print(res);


    }
}