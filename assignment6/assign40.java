import java.util.Scanner;

class Q40{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter size of array 1: ");
int s1 = sc.nextInt();


int arr1[] = new int[s1];

for(int i=0;i<s1;i++){
System.out.print("Enter "+(i+1)+" element of array 1: ");
arr1[i] = sc.nextInt();
}

System.out.println();
System.out.print("Enter size of array 2: ");
int s2 = sc.nextInt();

int arr2[] = new int[s2];

for(int i=0;i<s2;i++){
System.out.print("Enter "+(i+1)+" element of array 2: ");
arr2[i] = sc.nextInt();
}


System.out.print("Array 1: ");
for(int i=0;i<s1;i++){
System.out.print(arr1[i]+" ");
}

System.out.print("\nArray 2: ");
for(int i=0;i<s2;i++){
System.out.print(arr2[i]+" ");
}

int arr3[] = new int[s1 + s2];

for(int i=0;i<s1;i++){
arr3[i] = arr1[i];
}

for(int i=0;i<s2;i++){
arr3[s1+i] = arr2[i];
}

System.out.print("\nNew Array: ");
for(int i=0;i<arr3.length;i++){
System.out.print(arr3[i] + " ");
}


}
}