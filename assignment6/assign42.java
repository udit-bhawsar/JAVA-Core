import java.util.Scanner;

class Q42{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter array size: ");
int s = sc.nextInt();

int arr[] = new int[s];

for(int i=0;i<s;i++){
System.out.print("Enter "+(i+1)+" elemet: ");
arr[i] = sc.nextInt();
}

System.out.print("Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}

for(int i=0;i<s-1;i++){
int min=i;
for(int j=i+1;j<s;j++){
if(arr[min]>arr[j]){
min = j;
}
}
int temp = arr[min];
arr[min] = arr[i];
arr[i] = temp;
}

System.out.print("\nAscending order Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}



for(int i=0;i<s-1;i++){
int min=i;
for(int j=i+1;j<s;j++){
if(arr[min]<arr[j]){
min = j;
}
}
int temp = arr[min];
arr[min] = arr[i];
arr[i] = temp;
}

System.out.print("\nDesceding order Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}


}
}