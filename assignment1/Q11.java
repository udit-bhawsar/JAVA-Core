import java.util.Scanner;

class Q11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter a value : ");
         int a = sc.nextInt();

          System.out.print("Enter b value : ");
         int b = sc.nextInt();

          System.out.print("Enter Relational Opertion value : ");
         int  op = sc.next().charAt(0);

         switch(op){

            case '>':
                System.out.println(a>b);
                break;
        
            case '<':
                System.out.println(a<b);
                break;

            case '=':
                System.out.println(a==b);
                break;
            
            case '!':
                System.out.println(a!=b);
                break;

            
            
         }

    }
}