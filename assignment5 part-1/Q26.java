import java.util.Scanner;
class Program26{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            if(i%2 == 0){
            System.out.print(i * i * i+ " ");
            }           
        }
        
   }
}