import java.util.Scanner;

class Q10{

void  greaterNum(int a,int b){
int n = (a>b) ? a : b;
System.out.print("Greater number: "+n);

}





public static void main(String args[]){
Scanner sc = new Scanner(System.in);
Q10 obj = new Q10();

System.out.print("Enter number 1: ");
int a = sc.nextInt();
System.out.print("Enter number 2: ");
int b = sc.nextInt();

if(a==b){
System.out.print("Both number are equal");
}
else{

obj.greaterNum(a,b);
}



}






}