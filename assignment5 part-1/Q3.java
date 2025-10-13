import java.util.Scanner;
class Program3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();

        int sum = 0;
       
           for(int i=0; i<=n; i++){
            sum = sum + i;
          }

        System.out.println("Sum of Total number is : " + sum);


    }
        

      
}