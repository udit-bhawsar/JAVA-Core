import java.util.Scanner;

class Q11{
    int arr[];

    void ascending() {
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            int temp = arr[i];
            int j = i-1;
            for ( ;j >= 0; j--) {
                if (arr[j] > temp){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = temp; 
        }
    }

    void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Q11 obj = new Q11(); 

        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        obj.arr = new int[size];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < size; i++) {
            obj.arr[i] = sc.nextInt();
        }
        obj.ascending();
        obj.printArray();

    }
}