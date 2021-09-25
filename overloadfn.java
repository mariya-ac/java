
import java.util.Scanner;

public class addoverload {
        void add(int x,int y){
            System.out.print("\n" +
                    "Sum of 2 integers is "+(x+y)+" \n");
        }
        void add(int x,int y, int z){

            System.out.print("Sum of 3 integers are "+(x+y+z)+" \n");
        }
        void add(float x,float y){
            System.out.print("Sum of 2 float values is "+(x+y)+" \n" );
        }
    }
    class overloadfn{
        public static void main(String args[]){
            int a,b,c,d,e;
            float m,n;
            Scanner reader=new Scanner(System.in);
            addoverload obj=new addoverload();
            System.out.print("Enter two integers: ");
            a=reader.nextInt();
            b=reader.nextInt();
            System.out.print("Enter three integers: ");
            c=reader.nextInt();
            d=reader.nextInt();
            e=reader.nextInt();
            System.out.print("Enter two float values: ");
            m=reader.nextFloat();
            n=reader.nextFloat();
            obj.add(a,b);
            obj.add(c,d,e);
            obj.add(m,n);
        }
    }