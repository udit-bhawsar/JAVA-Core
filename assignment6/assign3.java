class Q3{
public static void main(String args[]){

int s = args.length;

int arr[] = new int[s];

for(int i=0;i<s;i++){
arr[i] = Integer.parseInt(args[i]);
}

double sum=0;
System.out.print("Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
sum += arr[i];
}

double avg = sum/s;
System.out.print("\nAverage of array: "+avg);


}

}