import java.util.Scanner;

class Q39{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter your array size: ");
int s = sc.nextInt();

int arr[] = new int[s];

for(int i=0;i<s;i++){
System.out.print("Enter "+(i+1)+" element: ");
arr[i] = sc.nextInt();
}

System.out.print("Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}

System.out.print("\nEnter index to remove element: ");
int p = sc.nextInt();



for(int i=p-1;i<s-1;i++){
arr[i] = arr[i+1];
}
s--;
System.out.print("New Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i] + " ");
}


}
}