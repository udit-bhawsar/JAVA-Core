

class Q1{
public static void main(String args[]){

if(args.length == 0){
System.out.println("Enter array element at command line argument");
}
else{
int s = args.length;
int arr[] = new int[s];

for(int i=0;i<s;i++){
arr[i]=Integer.parseInt(args[i]);
}

System.out.print("Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}

System.out.println("\nSum of First and Last element of array: "+(arr[0]+arr[s-1]));
}

}
}