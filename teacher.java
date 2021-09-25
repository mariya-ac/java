
import java.util.Scanner;

public class employee {
    int empid;
    String name;
    float salary;
    String address;

    public employee() {
        empid = 0;
        name = " ";
        salary = 0;
        address = " ";
    }

    public void input() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the employee number : ");
        empid = reader.nextInt();
        System.out.print("Enter the employee name : ");
        name = reader.next();
        System.out.print("Enter the employee salary : ");
        salary = reader.nextFloat();
        System.out.print("Enter the employee address : ");
        address = reader.next();
    }

}
class teacher extends employee {
    String dept,sub;
    public teacher(){
        dept=" ";
        sub=" ";

    }
    public void data() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the department : ");
        dept = reader.next();
        System.out.print("Enter the subject taught : ");
        sub=reader.next();

    }
    public void output() {
        System.out.println("Employee id = " + empid);
        System.out.println("Employee na opme = " + name);
        System.out.println("Employee salary = " + salary);
        System.out.println("Employee address = " + address);
        System.out.println("Employee department = " + dept);
        System.out.println("Subject taught = "+sub);

    }

    public static void main(String[] args) {
        int n;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number of Employees: ");
        n = reader.nextInt();
        teacher t[] = new teacher[n];

        for (int i = 0; i < n; i++) {
            t[i] = new teacher();
            t[i].input();
            t[i].data();
            System.out.print("\n");
        }

        System.out.println("Employee Details");
        for (int i = 0; i < n; i++) {
            t[i].output();
            System.out.print("\n");
        }
    }
}