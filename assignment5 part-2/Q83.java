class Program83{
    public static void main(String args[]){
        
        for(char i='A'; i<='E'; i++){
            for(int j='A'; j<=i; j++){
               if (j == 'A' || j == i || i == 'E') {
                    System.out.print(i);
                } else {
                    System.out.print("  ");   
                }
            }
            System.out.println(" ");
        }
    }
}