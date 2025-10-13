import java.util.Scanner;
class Program49{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number (starting) : ");
        int start = sc.nextInt();
         System.out.print("Enter n number (ending): ");
        int end = sc.nextInt();
 
  
      
        while(start <= end){
        int sum = 0;
        int i=1;
         System.out.println(" Number is:" + start);
        while(i < start){
            if(start%i == 0){
            System.out.print(i + " ");
            sum += i;
            }
            i++;
        }
        System.out.println("\nSum is : " + sum);
          start++;
        if(start == sum){
          System.out.println("\nIt is a Perfect number ");
        }
        else{
          System.out.println("\nIts is not a Perfect number");
        }
        }
        System.out.println(" ");
   }
}