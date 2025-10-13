import java.util.Scanner;
class Program56{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int start = sc.nextInt();
        System.out.println("Enter number: ");
        int end = sc.nextInt();

       int fact = 1;

       for(int i=start; i<=end; i++){
        fact = fact*i;
        System.out.print(fact + " ");
       } 
   }
}