import java.util.Scanner;
class Program20{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print(i*n + " ");
        }

   }
}