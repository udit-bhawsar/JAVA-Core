import java.util.Scanner;


class Marksheet{
final static String WHITE_BG = "\u001B[47m";
final static String BLACK_TEXT = "\u001B[30m";
final static String RESET = "\u001B[0m";
String s_name;
int s_marks;
String p_name;
int p_marks;

void setSubMarks(int i){
System.out.println();
Scanner sc = new Scanner(System.in);
System.out.print("Enter your "+(i+1)+" subject name: ");
s_name = sc.nextLine(); 
System.out.print("Enter your "+(i+1)+" subject marks: ");
s_marks = sc.nextInt(); 
checkSubMark(i);
}


void setPrMarks(int i){
System.out.println();
Scanner sc = new Scanner(System.in);
System.out.print("Enter your "+(i+1)+" practical subject name: ");
p_name = sc.nextLine(); 
System.out.print("Enter your "+(i+1)+" practical subject marks: ");
p_marks = sc.nextInt(); 
checkPrMark(i);
}


void checkSubMark(int i){
if(s_marks > 100 || s_marks < 0){
setSubMarks(i);
}
}


void checkPrMark(int i){
if(p_marks > 25 || p_marks < 0){
setPrMarks(i);
}
}

void subMarksDisplay(){
System.out.printf(WHITE_BG + BLACK_TEXT + String.format("| %-10s |     %-9s |     %-9d |        %-8s  |", s_name,"TH",100, s_marks) + RESET + "\n");

}

void subPrDisplay(){
System.out.printf(WHITE_BG + BLACK_TEXT + String.format("| %-10s |     %-9s |     %-9d |        %-8s  |", p_name,"PR",25, p_marks) + RESET + "\n");
}


}


class Main{

final static String RESET = "\u001B[0m";

final static String BLUE_BG = "\u001B[44m";       // Header Background
final static String WHITE_BG = "\u001B[47m";      // Table Rows Background
final static String CYAN_BG = "\u001B[46m";       // Footer / Signature Background

final static String BLACK_TEXT = "\u001B[30m";
final static String WHITE_TEXT = "\u001B[37m";
final static String YELLOW_TEXT = "\u001B[33m";   // Highlight Percentage
final static String GREEN_TEXT = "\u001B[32m";    // Pass
final static String RED_TEXT = "\u001B[31m";    
public static final String CYAN_TEXT = "\u001B[36m";
public static final String BLUE_TEXT = "\u001B[34m";

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int count=0;
int t_submarks=0;
int t_prmarks=0;


Marksheet sub[] = new Marksheet[5];
Marksheet pr[] = new Marksheet[2];

System.out.print("Enter your name: ");
String name = sc.nextLine();
System.out.print("Enter your roll number: ");
int rollno = sc.nextInt();
sc.nextLine();
System.out.print("Enter your course: ");
String cname = sc.nextLine();
System.out.print("Enter your Semester: ");
int sem = sc.nextInt();
sc.nextLine();
System.out.print("Enter your Status(Regular or Private): ");
String status = sc.nextLine();
System.out.print("Enter your father's name: ");
String fname = sc.nextLine();

System.out.println();
System.out.println("Enter your 5 subject marks:- ");
for(int i=0;i<5;i++){
sub[i] = new Marksheet();
sub[i].setSubMarks(i);
}


System.out.println();
System.out.println();
System.out.println("Enter your 2 pratical marks:- ");
for(int i=0;i<2;i++){
pr[i] = new Marksheet();
pr[i].setPrMarks(i);
}

System.out.println();
System.out.println(CYAN_BG + BLACK_TEXT + "|---------------------------------------------------------------|" + RESET);
System.out.println(CYAN_BG + BLACK_TEXT + "|               Govt. Holkar Science College , Indore           |" + RESET);
System.out.println(CYAN_BG + BLACK_TEXT + "|                            MARKSHEET                          |" + RESET);
System.out.println(CYAN_BG + BLACK_TEXT + "|                   SEMESTER EXAMINATION 2024-2025              |" + RESET);
System.out.println(CYAN_BG + BLACK_TEXT + "|---------------------------------------------------------------|" + RESET);
System.out.printf(WHITE_BG + BLACK_TEXT + String.format( "| Student Name  : %-26s Status   : %-8s|", name,status) + RESET + "\n");
System.out.printf(WHITE_BG + BLACK_TEXT + String.format( "| Roll Number   : %-26d Course   : %-8s|", rollno,cname) + RESET + "\n");
System.out.printf(WHITE_BG + BLACK_TEXT + String.format( "| Father's Name : %-26s Semester : %-8d|", fname,sem) + RESET + "\n");
System.out.println(WHITE_BG + BLACK_TEXT + "|---------------------------------------------------------------|" + RESET);
System.out.printf(WHITE_BG + BLACK_TEXT + String.format( "| %-10s |    %-10s |    %-10s |     %-10s   |", "Subject","Paper","Out of", "Obtained") + RESET + "\n");
System.out.println(WHITE_BG + BLACK_TEXT + "|---------------------------------------------------------------|" + RESET);

for(Marksheet el : sub){
el.subMarksDisplay();
}

for(Marksheet el : pr){
el.subPrDisplay();
}

for(Marksheet el : sub){
t_submarks = t_submarks + el.s_marks;
if(el.s_marks < 33){
count++;
}
}

for(Marksheet el : pr){
t_prmarks = t_prmarks + el.p_marks;
}

int t_marks = t_prmarks + t_submarks;
float per = (float)t_marks/5.5f;


System.out.println(WHITE_BG + BLACK_TEXT + "|---------------------------------------------------------------|" + RESET);

System.out.printf(WHITE_BG + BLACK_TEXT + String.format("| %-26s |     %-9d |        %-9d |", "Total", 550, t_marks) + RESET + "\n");

System.out.println(WHITE_BG + BLACK_TEXT + "|---------------------------------------------------------------|" + RESET);

System.out.printf(WHITE_BG + BLACK_TEXT + String.format( "| Percentage : %-10.2f %-37s |", per, "") + RESET + "\n");

if(per >=90){                           
System.out.println(WHITE_BG + BLACK_TEXT + "| Grade      : A+                                               |" + RESET);
}
else if(per >= 81){
System.out.println(WHITE_BG + BLACK_TEXT + "| Grade      : A                                                |" + RESET);
}
else if(per >= 70){
System.out.println(WHITE_BG + BLACK_TEXT + "| Grade      : B+                                               |" + RESET);
}
else if(per >= 60){
System.out.println(WHITE_BG + BLACK_TEXT + "| Grade      : B                                                |" + RESET);
}
else if(per >= 50){
System.out.println(WHITE_BG + BLACK_TEXT + "| Grade      : C                                                |" + RESET);
}
else if(per >= 33){
System.out.println(WHITE_BG + BLACK_TEXT + "| Grade      : D                                                |" + RESET);
}
else{
System.out.println(WHITE_BG + BLACK_TEXT + "| Grade      : F                                                |" + RESET);
}




if(count == 0){
System.out.printf(WHITE_BG + GREEN_TEXT + String.format( "| Remark     : PASS %-43s |","") + RESET + "\n");
}
else if(count > 0 && count < 3){
System.out.printf(WHITE_BG + YELLOW_TEXT + String.format( "| Remark     : %-1d ATKT %-41s |", count, "") + RESET + "\n");
}
else{
System.out.printf(WHITE_BG + RED_TEXT + String.format("| Remark     : YEAR BACK %-38s |", "") + RESET + "\n");
}


System.out.println(WHITE_BG + BLACK_TEXT + "|---------------------------------------------------------------|" + RESET);

if(count == 0){
System.out.println(WHITE_BG + BLACK_TEXT + "| Promoted to Next Semester                                     |" + RESET);
}
else if(count > 0 && count < 3){
System.out.println(WHITE_BG + BLACK_TEXT + "| Promoted with ATKT                                            |" + RESET );
}
else{
System.out.println(WHITE_BG + BLACK_TEXT + "| Not Promoted                                                  |"+ RESET);
}

System.out.println(WHITE_BG + BLACK_TEXT + "|                                                Principal      |" + RESET);
System.out.println(WHITE_BG + BLACK_TEXT + "|                                            DR. MANISH PUNDLIK |" + RESET);
System.out.println(WHITE_BG + BLACK_TEXT + "|---------------------------------------------------------------|" + RESET);


}
}