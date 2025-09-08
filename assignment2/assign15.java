class Q15{
public static void main(String args[]){
int s_length=22;
int s_breadth=15;
int r_side=21;

double s_area=0.5*s_length*s_breadth;
double r_area=r_side*r_side;

double d=r_area-s_area;

System.out.println("Area of the Shelly's garden: "+s_area+" m sq");
System.out.println("Area of the Rachel's garden: "+r_area+" m sq");
System.out.println("Rachel's garden is "+d+" m sq bigger than shelly's garden");

}
}