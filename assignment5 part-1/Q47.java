import java.util.Scanner;
class Program47{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 (Start) : ");
        int start = sc.nextInt();
        System.out.print("Enter number 2 (End) : ");
        int end = sc.nextInt();

       while(start <= end){
        int i=1;
        System.out.println("Table of "+ start);
         while(i <= 10){

            System.out.println(start +" * " + i + " = " + (start*i));
            i++;
         }
         System.out.println("\n");
         start++;
         
       }
   }

}