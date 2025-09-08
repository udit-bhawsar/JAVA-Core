import java.util.Scanner;

class Q23{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();


        String  res = (a%2==0)?"Even":"Odd";

       System.out.print(res);


    }
}