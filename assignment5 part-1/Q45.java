import java.util.Scanner;
class Program45{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        //  int m = n; 
        int sum = 0 ;
        while(n!=0){
           int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println("Total sum of all digit is : " + sum);
       
   }
}