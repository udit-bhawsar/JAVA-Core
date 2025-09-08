class Q6{
public static void main(String args[]){
int a=10;
int b=9;
int perimeter=36;
int c=perimeter-(a+b);
float s=(a+b+c)/2;
double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

System.out.println("Third side: " +c+ "cm");
System.out.println("Area of Triangle: " +area+ "cm sq");


}
}