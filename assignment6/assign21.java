import java.util.Scanner;
class Q21{

void Per(double t){

double percentage = (t/5);
System.out.println("Your percentage is : " + percentage);

if(percentage >75 && percentage <= 100){
System.out.print("Grade A");
}
else if(percentage >60 && percentage <= 75){
System.out.print("Grade B");
}
else if(percentage >50 && percentage <= 60){
System.out.print("Grade C");
}
else if(percentage >33 && percentage <= 50){
System.out.print("Grade D");
}
else{
System.out.print("Fail");
}



}
public static void main(String args[] ){
Scanner sc = new Scanner(System.in);

System.out.print("Enter MAths Marks : ");
int MathMarks = sc.nextInt(); 

System.out.print("Enter Bio MArks : ");
int BioMarks = sc.nextInt();

System.out.print("Enter HindiMArks : ");
int HindiMarks = sc.nextInt();

System.out.print("Enter EnglishMArks : ");
int EnglishMarks = sc.nextInt();

System.out.print("Enter Science MArks : ");
int ScienceMarks = sc.nextInt(); 

double Obtain = (MathMarks + BioMarks + HindiMarks + EnglishMarks + ScienceMarks);
System.out.println("Total MArks is :" + Obtain);


Q21 obj = new Q21();

obj.Per(Obtain);



}
}