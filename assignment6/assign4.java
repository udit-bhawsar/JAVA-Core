class Q4{
public static void main(String args[]){

int s = args.length;

int arr[] = new int[s];

for(int i=0;i<s;i++){
arr[i] = Integer.parseInt(args[i]);
}

System.out.print("Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}

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
}