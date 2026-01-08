import java.util.Scanner;

class Q37{

void IndRev(int arr[],int s){
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
public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter number of element: ");
int s = sc.nextInt();

int arr[] = new int[s];

for(int i=0;i<s;i++){
System.out.print("Enter "+(i+1)+" of element: ");
arr[i] = sc.nextInt();
}

System.out.print("Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}


Q37 obj = new Q37();
obj.IndRev(arr,s);


}

}