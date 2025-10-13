import java.util.Scanner;
class Program9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        // int n = sc.nextInt();
        int n=50;

        for(int i=1; i <= n; i++){
            if(i%2 == 0 ){
                System.out.print(i + " ");
            }
        }        
        
     }
}