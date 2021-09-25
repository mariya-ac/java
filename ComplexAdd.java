
import java.util.Scanner;
 class Complex {
        float real;
       float imag;
      
     Complex(){
     real=0 ; imag=0;
     }
public void input() {
       Scanner reader=new Scanner(System.in);
       System.out.println("Enter real and imaginary parts:");
        real=reader.nextFloat();
       imag=reader.nextFloat();
      }
 public Complex add(Complex obj) {
            Complex temp=new Complex();
            temp.real=real +obj.real;
            temp.imag=imag+obj.imag;
            return temp;
          }
        
public void output() {
if(imag<0)
{
   System.out.print("complex number:");
   System.out.println(real  +  "+"   + imag +  "i");
 }
  
 else
{
   System.out.print("complex number:");
   System.out.println(real  +  "+"   + imag +  "i");
 }

}
};
public class ComplexAdd{
public static void main (String [] args) {
  Complex complex1=new Complex();
  Complex complex2=new Complex();
 Complex result=new Complex();
  System.out.println("Enter first complex number:\n");
 complex1.input();
System.out.println("Enter second complex number:\n");
 complex2.input();
  result=complex1.add(complex2);
 result.output();
}
}