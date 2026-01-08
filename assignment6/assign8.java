class Q8{
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

for(int i=0;i<s-1;i++){
for(int j=0;j<s-1-i;j++){
if(arr[j]>arr[j+1]){
int temp = arr[j+1];
arr[j+1] = arr[j];
arr[j] = temp;
}
}
}

System.out.print("\nAscending order Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}



for(int i=0;i<s-1;i++){
for(int j=0;j<s-1-i;j++){
if(arr[j]<arr[j+1]){
int temp = arr[j+1];
arr[j+1] = arr[j];
arr[j] = temp;
}
}
}

System.out.print("\nDesceding order Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}


}
}