class Q11 {
public static void main(String args[]) {
int area = 320;
int b = 8;
int h = 5;
double scale = Math.sqrt(area / (0.5 * b * h));
double base = b * scale;
double height = h * scale;

System.out.println("Base is : " + base);
System.out.println("Height is : " + height);
    }
}