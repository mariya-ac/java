



import java.util.Scanner;
class stud {
    public static void main(String[] args) {
String name;
int roll;
char grade;
char[] branch;
double mark;
Scanner reader=new Scanner(System.in);
System.out.print("Enter student name:");
name= reader.nextLine();
System.out.print("Enter roll number:");
roll=reader.nextInt();
System.out.print("Enter branch:");
branch=reader.next().toCharArray();
System.out.print("Enter student mark:");
mark=reader.nextDouble();
System.out.print("Enter student grade:");
grade=reader.next().charAt(0);

System.out.println("Student details:\nName: "+name+"\nRoll number: "+roll);
System.out.print("Branch :");
for(int i=0;i<branch.length;i++)
 System.out.print(branch[i]);
System.out.println("\nMArk : "+mark+"\nGrade: "+grade);

}
}