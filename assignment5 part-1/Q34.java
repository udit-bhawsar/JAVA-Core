import java.util.Scanner;
class Program34{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number: ");
        int n = sc.nextInt();

        int sum = 0;
        int i=1;

        while(i < n){
            if(n%i == 0){
            System.out.print(i + " ");
            sum += i;
            }
            i++;
        }
        System.out.print("\nSum is : " + sum);
        if(n == sum){
          System.out.println("\nIt is a Perfect number ");
        }
        else{
          System.out.println("\nIts is not a Perfect number");
        }
   }
}