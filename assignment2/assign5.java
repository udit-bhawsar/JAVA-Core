class Q5{
public static void main(String args[]){
int p_length=20;
int fence_cost=1600;
int ratepm=25;
float perimeter=fence_cost/ratepm;
float p_breadth=perimeter/2-p_length;
float area=p_length*p_breadth;

System.out.println("Breadth of the Park: " +p_breadth+ "m");
System.out.println("Perimeter of Park: " +perimeter+ "m sq");
System.out.println("Area of the park: " +area+ "m sq");



}
}