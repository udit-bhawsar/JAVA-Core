import java.util.Scanner;

class Q38{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter subject 1: ");
int s1 = sc.nextInt();
System.out.print("Enter subject 2: ");
int s2 = sc.nextInt();
System.out.print("Enter subject 3: ");
int s3 = sc.nextInt();

int c = 0;
int avg = (s1 + s2 + s3)/3;
int tmarks = s1 + s2 + s3;
System.out.println("Total marks: "+tmarks);

if( (s1 >= 75) ){
if( (s2 >= 75) ){
if( (s3 >= 75) ){
c++;
}
c++;
}
c++;
}


if((c==3) && (avg>=80)){
System.out.println("Congratulations Pass!!
+");
}
else{
System.out.println("Opps Fail!!");
}


}
}