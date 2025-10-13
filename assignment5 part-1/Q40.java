import java.util.Scanner;
class Program40{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number : ");
        int n = sc.nextInt();

        int Even = 0;
        int  Odd = 0;
        int count = 0;
        while(n != 0){
            n = n/10;
            if( n%2 == 0){
                Even++;
                count++;
            }
            else{
                Odd++;
                count++;
            }
        }
        System.out.print("\nTotal number of count is: " + count);
        System.out.println("\nTotal Even Number is: " + Even);
        System.out.println("\nTotal Odd Number is: " + Odd);



   }
}