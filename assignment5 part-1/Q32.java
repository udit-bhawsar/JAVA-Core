import java.util.Scanner;
class Program32{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number : ");
        int n = sc.nextInt();

        for(char ch = 'A'; ch<=n; ch++ ){
            if(ch%2 == 0){
                char low = (char)(ch + 32);
                System.out.print( low + " ");
            }

            else{
                System.out.print(ch + " ");
            }
        }
   }
}