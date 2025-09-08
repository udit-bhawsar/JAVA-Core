class Q30{
public static void main(String args[]){
int l=200;
int b=400;
int tile_l=5;
int tile_b=8;
double area=l*b;
int tile_area=tile_l*tile_b;
double no_tile=area/tile_area;


System.out.println(no_tile+" tiles of size 5 cm × 8 cm are needed to tile the floor of the bedroom");
}
}