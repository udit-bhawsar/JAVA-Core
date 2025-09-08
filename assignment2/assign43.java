class Q43{
public static void main(String args[]) {

double height = 4;
double slant_height = 5;
double rate = 10;
double pi = 3.14;

double radius = Math.sqrt((slant_height * slant_height) - (height * height));
double base_area = pi * radius * radius;
double cost = base_area * rate;

System.out.println("Cost of polishing the base = " + cost + "rs");
}
}