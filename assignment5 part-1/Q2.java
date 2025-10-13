import java.util.Scanner;
class Program2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much number do you want print");
        int n = sc.nextInt();

        if(n<0){
            System.out.println("Number is not valid .Its a negative number");
            
        }
        else if(n>0){
            for(int i = 1; i <=n; i++){
                System.out.println(n);            }
        }
        else{
             System.out.println("Invalid Output");
        }

   }
}