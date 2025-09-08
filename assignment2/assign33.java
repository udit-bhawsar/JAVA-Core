class Q33{
public static void main(String args[]){
int l=30;
int b=20;
int p1=3;
int p2=4;
int area=l*b;
int p1_area=p1*b;
int p2_area=p2*l;
int overlap_a=p1*p2;


int path_a=p1_area+p2_area-overlap_a;
double usable_area=area-path_a;


System.out.println("The total usable area of the garden is "+usable_area+" square meters");
}
}