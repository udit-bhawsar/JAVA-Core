class Q7{
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