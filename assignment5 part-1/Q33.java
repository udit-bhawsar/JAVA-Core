import java.util.Scanner;
class Program33{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number: ");
        char n = sc.next().charAt(0);

        for(char ch='z'; ch>=n; ch--){
            System.out.print("\n" + ch + " ");
            
        }
   }
}