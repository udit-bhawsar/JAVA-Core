import java.util.Scanner;

class Q22{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        System.out.print("Enter value of c : ");
        int c = sc.nextInt();

        int  res = (a>=b && b>=c)?a:(b>=c)?b:c;

       System.out.print(res);


    }
}
