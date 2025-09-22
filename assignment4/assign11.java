import java.util.Scanner;

class Q11{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String vaccines[] = {"BCG", "Polio", "Hepatitis B", "MMR", "DPT"};
boolean status[] = new boolean[vaccines.length];

System.out.print("Enter Child Name: ");
String childName = sc.nextLine();
System.out.print("Enter Parent Name: ");
String parentName = sc.nextLine();
System.out.print("Enter Age: ");
int age = sc.nextInt();

while(true){

System.out.println("\n--- Vaccination Menu ---");
System.out.println("1. Show Vaccination Report");
System.out.println("2. Mark Vaccine as Given");
System.out.println("3. Exit");
System.out.print("Enter choice: ");
int choice = sc.nextInt();

switch(choice){
case 1:
System.out.println("\nChild Name: " + childName + ", Age: " + age);
System.out.println("Parent Name: " + parentName);
System.out.println("Vaccination Report:");
for(int i = 0; i < vaccines.length; i++) {
System.out.println((i+1) + ". " + vaccines[i] + "  - " + (status[i] ? "Given" : "Not Given"));
}
break;

case 2:
System.out.println("Enter Vaccine Number to mark as Given: ");
for(int i = 0; i < vaccines.length; i++) {
System.out.println((i+1) + ". " + vaccines[i]);
}
int vchoice = sc.nextInt();
if (vchoice >= 1 && vchoice <= vaccines.length) {
status[vchoice-1] = true;
System.out.println(vaccines[vchoice-1] + " marked as Given!");
}
else{
System.out.println("Invalid choice!");
}
break;

case 3:
System.out.println("Exiting...");
return;

default:
System.out.println("Invalid choice!");
}

}


}
}