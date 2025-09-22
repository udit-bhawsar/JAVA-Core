import java.util.Scanner;
class Q19{

void checkAge(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter your age: ");
int age = sc.nextInt();
if(age>=18){
System.out.print("Eligible to vote");
}
else{
System.out.print("NOt eligible to vote");
}
}






public static void main(String args[]){
Scanner sc = new Scanner(System.in);
Q19 obj = new Q19();

System.out.print("Enter I/i for Indian nationality: ");
char c = sc.next().charAt(0);
if(c=='i' || c== 'I'){
obj.checkAge();
}
else{
System.out.print("Not Indian");
}

}


} 