import java.util.Scanner;
class Q24{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter value of a : ");
    int a = sc.nextInt();

     System.out.print("Enter value of b : ");
    int b = sc.nextInt();

    if(a==b){
        System.out.print("Both number is equal");
    }
    else if(a>b){
        System.out.print("a number is greater than b");

    }
    else {
        System.out.print("b number is greater than a");

    }

 
}
}