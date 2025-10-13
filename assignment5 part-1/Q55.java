import java.util.Scanner;
class Program55{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int start = sc.nextInt();
        System.out.println("Enter Number");
        int end = sc.nextInt();

         

        for(int i=start; i <=end; i++){
            if(i%2 == 1 ){
                System.out.print(i + " ");
            }
        }        
    
        
     }
}