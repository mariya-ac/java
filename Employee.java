
import java.util.Scanner;
 
public class Employee {
 
 int eno;
 String ename;
 float esalary;
 
 public void Data() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the eno : ");
  eno = in.nextInt();
  System.out.print("Enter the ename : ");
  ename = in.next();
  System.out.print("Enter the esalary : ");
  esalary = in.nextFloat();
 }
 
 public void display() {
  
  System.out.println("Employee id = " + eno);
  System.out.println("Employee name = " + ename);
  System.out.println("Employee salary = " + esalary);
 }
 
 public static void main(String[] args) {
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of Employees:");
 n=sc.nextInt();
  Employee e[] = new Employee[n];
  
  for(int i=0; i<n; i++) {
   
   e[i] = new Employee();
   e[i].Data();
  }
  
  System.out.println("---Details---");
  
  for(int i=0; i<n; i++) {
   
   e[i].display();
  }
 }
}