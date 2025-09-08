class Q3{
public static void main(String args[]){
int tile_length=13;
int tile_breadth=7;
int region_length=520;
int region_breadth=140;

double area_of_tile=tile_length*tile_breadth;
double area_of_region=region_length*region_breadth;

double no_of_tile=area_of_region/area_of_tile;

System.out.println("Area of Tile: " +area_of_tile+ "cm sq");
System.out.println("Area of Region: " +area_of_region+ "cm sq");
System.out.println("Total Number of tiles used to cover region: " +no_of_tile+ "cm sq");


}
}