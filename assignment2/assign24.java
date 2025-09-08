class Q24{
public static void main(String args[]){
int bl=25;
int bw=10;
float bh=7.5f;
int wl=20*100;
int ww=2*100;
float wh=0.75f*100;
float bv=bl*bw*bh;
float wv=wl*ww*wh;
double no_b=wv/bv;
float bcost=900/1000f;
double tcost=no_b*bcost; 

System.out.println("Number of bricks needed: "+no_b);
System.out.println("Total cost: "+tcost);
}
}