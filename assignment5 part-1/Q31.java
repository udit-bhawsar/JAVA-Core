import java.util.Scanner;
class Program31{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        int count = 0;
        int sum=0;
        for(int i=0;i<n;i++){
            count=count*10 + 1;
            if( i == n-1){
                System.out.println(" :");
            }
            else{
            System.out.print(count+" + ");
            }
            sum=sum+count;
            
        }
        System.out.println("\n Total value sum is : "  + sum);

   }
}