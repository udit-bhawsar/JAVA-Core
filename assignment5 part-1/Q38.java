import java.util.Scanner;
class Program38{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter and Check Number is Armstrong or Not : ");
        int n = sc.nextInt();
 
        int m = n; 
        int sum = 0 ;
        while(n!=0){
           int rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }
        System.out.println(sum);
        if(m == sum){
            System.out.print("\n It is a Armstrong Number");        
            }
    
        else{
            System.out.print("\n It is not a Armstrong Number");
        }
   }
}