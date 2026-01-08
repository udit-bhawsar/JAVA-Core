class Program64{
    public static void main(String args[]){
        
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=i; j<=i*(n/2); j++){
            System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}