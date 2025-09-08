import java.util.Scanner;
class Q20{
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

        if(percentage >=75 && percentage <= 100){
            System.out.print(percentage + "  is lie between in 75 to 100 ");
        }
        else{
              System.out.print(percentage + "  is not lie between in 75 to 100 ");
        }
    }
}