import java.util.Scanner;
class Program1{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);


        System.out.println("Enter a Statement");
        String statement = sc.nextLine();

        for(int i = 0; i <= 999; i++){
            System.out.println(statement);
        } 

   }
}