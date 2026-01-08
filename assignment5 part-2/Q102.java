class Program102{
    public static void main(String args[]){
        char ch=65;
        for(int i=1; i<=5;i++){
            for(int j=1; j<=(i*2)-1; j++){
                System.out.print(ch++);
            }
            System.out.println(" ");
        }
    }
}