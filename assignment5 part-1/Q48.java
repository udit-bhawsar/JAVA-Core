import java.util.Scanner;
class Program48{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Starting number : ");
        int start = sc.nextInt();
        System.out.println("Enter a Ending number: ");
        int end = sc.nextInt();

         while(start <= end){
            int i =1;
            System.out.print("Factor of " + start + " is :  ");
            while(i <= start){
                if(start%i == 0){
                    System.out.print(i + " ");
                }

                i++;

            }
            System.out.println(" ");
            start++;
         }
         
   }
}