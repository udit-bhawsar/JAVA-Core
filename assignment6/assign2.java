class Q2{
public static void main(String args[]){

int s = args.length;

int arr[] = new int[s];

for(int i=0;i<s;i++){
arr[i] = Integer.parseInt(args[i]);
}

int sum = 0;
System.out.print("Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
sum = sum + arr[i];
}

System.out.println("\nSum of array: "+sum);

}
}