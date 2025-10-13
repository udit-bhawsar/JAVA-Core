import java.util.Scanner;
class Program16{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n : ");
        int n = sc.nextInt();

        for(int i=-n; i<= n; i++){
            System.out.print(i + " ");
            i = i + 2;
        }
   }
}