import java.util.Scanner;
class Program17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number : ");
        int num=sc.nextInt();
        int sum=1;
        System.out.print(sum+" ");
        for(int i=1;i<=num;i++){
            sum=sum+i;
       System.out.print(sum+" ");
        }

   }
}