
import java.util.Scanner;

class Q36{

void RevArray(int arr[],int s){
for(int i=0;i<s/2;i++){
int temp = arr[i];
arr[i] = arr[s - 1 - i];
arr[s - 1 - i] = temp;
}

System.out.print("\nReversed Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}
}


public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter number of element: ");
int s = sc.nextInt();

int arr[] = new int[s];

for(int i=0;i<s;i++){
System.out.print("Enter "+(i+1)+" of element: ");
arr[i] = sc.nextInt();
}

System.out.print("Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}

Q36 obj = new Q36();

obj.RevArray(arr,s);

}
}