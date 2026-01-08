import java.util.Scanner;

class Q38{
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

System.out.print("\nEnter element to insert: ");
int el = sc.nextInt();
System.out.print("Enter index: ");
int p = sc.nextInt();


int newarr[] = new int[s+1];

for(int i=0;i<p-1;i++){
newarr[i] = arr[i];
}
newarr[p-1] = el ;

for(int i=p;i<newarr.length;i++){
newarr[i] = arr[i-1];
}

System.out.print("New Array: ");
for(int i=0;i<newarr.length;i++){
System.out.print(newarr[i] + " ");
}


}
}
