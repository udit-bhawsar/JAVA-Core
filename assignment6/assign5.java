class Q5{
public static void main(String args[]){

int s = args.length;

int arr[] = new int[s];

for(int i=0;i<s;i++){
arr[i]=Integer.parseInt(args[i]);
}

System.out.print("Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}


System.out.print("\nAfter reversing individual elements of array: ");

for(int i=0;i<s;i++){
int num = arr[i];

int rev = 0;
while(num!=0){

rev = rev * 10 + num % 10;
num = num/10;
}

arr[i] = rev;
}

System.out.print("Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}




}

}