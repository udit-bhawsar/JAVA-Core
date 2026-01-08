import java.util.Scanner;

class Q41{

void Pal(int arr[],int temp[],int s){
int count = 0;
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

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter number of element: ");
int s = sc.nextInt();

int arr[] = new int[s];
int temp[] = new int[s];

for(int i=0;i<s;i++){
System.out.print("Enter "+(i+1)+" of element: ");
arr[i] = sc.nextInt();
}

System.out.print("Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}

for(int i=0,j=s-1;i<s && j>=0;i++,j--){
temp[i] = arr[j];
}

Q41 obj = new Q41();

obj.Pal(arr,temp,s);
}
}