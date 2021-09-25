
import java.util.Scanner;

public class Employeeinfo {
        int eno; 
        String ename;
        float esalary;
        Employeeinfo(){
            eno=0;
            ename=" ";
            esalary=0;
        }
        public void input() {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter the employee number : ");
            eno = reader.nextInt();
            System.out.print("Enter the employee name : ");
            ename = reader.next();
            System.out.print("Enter the employee salary : ");
            esalary = reader.nextFloat();
        }

        public void output() {
            System.out.println("Employee id = " + eno);
            System.out.println("Employee name = " + ename);
            System.out.println("Employee salary = " + esalary);
        }

        public static void main(String[] args) {
            int n;
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter the number of Employees: ");
            n = reader.nextInt();
            Employeeinfo e[] = new Employeeinfo[n];

            for (int i = 0; i < n; i++) {
                e[i] = new Employeeinfo();
                e[i].input();
                System.out.print("\n");
            }
            System.out.print("Enter employee number to be searched :");
            int elem = reader.nextInt();
            int f=0;
            System.out.println("Employee Details");
            for (int i = 0; i < n; i++) {
                if (e[i].eno==elem) {
                    f=1;
                    break;
                }
            }
            if(f==0)
                System.out.print("Employee not present");
            else
            {
                for (int i = 0; i < n; i++){
                    if (e[i].eno==elem)
                    e[i].output();
                }

        }
    }
}