import java.util.Scanner;
class Program7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int m = n-1;
        for(int i=2; i<=m; i++){
            if(n%i == 0){
                System.out.println("Its not a prime number");
                
            }
            else{
                System.out.println("Its is a prime number");
                
            }
        }


   }
}