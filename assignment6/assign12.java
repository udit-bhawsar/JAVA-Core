import java.util.Arrays;

class Q12{
public static void main(String args[]){

int s = args.length;


System.out.print("Array: ");
for(int i=0;i<s;i++){
System.out.print(args[i]+" ");
}

Arrays.sort(args);

System.out.print("\nAfter Sorting names in an Alphabetical Order: ");
for(int i=0;i<s;i++){
System.out.print(args[i]+" ");
}

}
}

