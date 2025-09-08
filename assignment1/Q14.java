import java.util.Scanner;
class Q14{
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter MArks : ");
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

        double percentage = (Obtain/5);
        System.out.println("Your percentage is : " + percentage);
    }
}