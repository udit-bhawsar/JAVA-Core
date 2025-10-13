import java.util.Scanner;
class Program8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int Fibo = sc.nextInt();

        // System.out.print("0  ");
        // System.out.print("1  ");

        int n1 = 0;
        int n2 = 1;

        for(int i=1; i<=Fibo; i++){

        System.out.print(n1 + " ");
               int n3 = n2 + n1;
               n1 = n2;
               n2 = n3;
        }

   }
}