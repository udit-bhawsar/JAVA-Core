import java.util.Scanner;
class Program5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for Table");
        int n = sc.nextInt();

            System.out.println("Printing The Table of :" + n + "\n");
        for(int i=1; i<=10; i++){

            System.out.println(n * i );
        }

   }
}