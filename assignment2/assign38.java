class Q38{
public static void main(String args[]){
float vcyl=1287;
int r=10;
double pi=Math.PI;
double n=r*r*pi;
double h=vcyl/n;
double surface_area = 2 * pi * r * (r + h);


System.out.println("The surface area of the cylinder is "+surface_area+" cm sq");
}
}