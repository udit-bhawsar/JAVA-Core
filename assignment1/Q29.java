import java.util.Scanner;

class Q29{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        System.out.print("Enter value of c : ");
        int c = sc.nextInt();

        System.out.print("Enter value of d : ");
        int d = sc.nextInt();

        int  res = (a>=b && b>=c)?a:(b>=c)?b:c;
        int final1 = (res>d)?res:d;

       System.out.print(final1);


    }
}