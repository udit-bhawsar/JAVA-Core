class Q9{
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

int max=0;
for(int i=0;i<s;i++){
if(arr[i]>max){
max = arr[i];
}
}
System.out.println("\nMaximum element in array: "+max);


}



}