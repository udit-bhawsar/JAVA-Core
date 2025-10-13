import java.util.Scanner;
class Program41{

    static int hcf(int num1, int num2){
        int hcf = 0;
        for(int i=1; i<= num1 && i<= num2; i++){
            if(num1%i == 0 && num2%i == 0){
                hcf = i;
            }
        }
        System.out.println("\nHCF of "+num1+" and "+num2+" : "+hcf);
        return hcf;
    }

    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd Number : ");
        int num2 = sc.nextInt();

        int hcf = hcf(num1,num2);
        int lcm = (num1 * num2) / hcf;
        System.out.println("LCM of "+num1+" and "+num2+" : "+lcm);
    }
}
