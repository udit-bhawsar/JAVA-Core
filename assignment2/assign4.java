class Q4{
public static void main(String args[]){
int plot_length=300;
int plot_breadth=150;
int area=plot_length*plot_breadth;

float rate=6/100f;
float total_rate=area*rate;

System.out.println("Area of plot: " +area+ "m sq");
System.out.println("Cost of tiling per meter: " +rate+ "$");
System.out.println("Total rate of tiling plot: " +total_rate+ "$/m");

}
}