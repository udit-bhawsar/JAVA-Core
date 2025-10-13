import java.util.Scanner;
class Program36{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        int rev = 0;

        while(n!=0){
            rev = n % 10;
            System.out.print(rev);
            n = n/10;
        }
   }
}
