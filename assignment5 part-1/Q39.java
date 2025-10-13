import java.util.Scanner;
class Program39{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter and Check Number is Strong or Not : ");
        int n = sc.nextInt();
 
        int m = n; 
        int sum = 0 ;
        while(n!=0){
           int rem = n%10;
           int fact = 1;

           while(rem!= 0){
            fact = fact * rem;
            rem--;
           }

            sum = sum + fact;
            n = n/10;
        }
        System.out.println(sum);
        if(m == sum){
            System.out.print("\n It is a  Strong Number");        
            }
    
        else{
            System.out.print("\n It is not a  Strong Number");
        }
   }
}