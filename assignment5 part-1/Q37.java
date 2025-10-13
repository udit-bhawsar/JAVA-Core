import java.util.Scanner;
class Program37{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter and Number is Palindrome or Not : ");
        int n = sc.nextInt();
 
        int m =n;
        int rem=0;
        int nrev=0;
        
        while(n!=0){
            rem = n%10;
            System.out.print(rem);
            nrev = (nrev*10) + rem;
            n = n/10;
        }
            // System.out.print(nrev);

        if(m == nrev){
            System.out.print("\n It is a Palindrome Number");        
            }
    
        else{
            System.out.print("\n It is not a Palindrome Number");
        }
   } 
}