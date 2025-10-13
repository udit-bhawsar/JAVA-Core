import java.util.Scanner;
class Program22{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(i * i * i + " ");
        }
        
   }
}