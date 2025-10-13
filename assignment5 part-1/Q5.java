import java.util.Scanner;
class Program4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int factorial = sc.nextInt();

       double fact = 1;

       for(int i=1; i<=factorial; i++){
        fact = fact*i;
       } 
       System.out.println("Total number of factorial is : " + fact);
   }
}