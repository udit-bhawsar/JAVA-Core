class Q6{

public static void main(String args[]){

int s = args.length;

int arr[] = new int[s];
int temp[] = new int[s];
int count = 0;

for(int i=0;i<s;i++){
arr[i]=Integer.parseInt(args[i]);
temp[i] = arr[i];
}

System.out.print("Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}


for(int i=0,j=s-1;i<s && j>=0;i++,j--){
temp[i] = arr[j];
}



for(int i=0;i<s;i++){
if(arr[i] == temp[i]){
count++;
}
}

if(count == s){
System.out.print("\nIt is a Palindrome Array");
}
else{
System.out.print("\nIt is not a Palindrome Array");
}

}
}