import java.util.Scanner;
class Program28{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(i%5 == 0){
                System.out.print(" Hello ");
            }
            else{
                System.out.print(i + " ");
            }
        }
   }
}