class Q29{
public static void main(String args[]){
int l=800;
int b=900;
int tile_s=10;
double f_area=l*b;
int tile_area=tile_s*tile_s;
double no_tile=f_area/tile_area;


System.out.println(no_tile+" tiles of side 10 cm are required to tile the floor");
}
}