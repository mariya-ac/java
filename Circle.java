
import java.util.Scanner;
public class Circle
{

double r;
public double cir(){
return 2*3.14*r;
}
public double area(){
return 3.14*r*r;
}
    public static void main(String[] args) 
    {
    Scanner sc= new Scanner(System.in) ;
    System.out.print("enter radius:");
    
       Circle aCircle;
       aCircle=new Circle();
       aCircle.r=sc.nextInt();

       double ar=aCircle.area();
       double cir=aCircle.cir();
       System.out.println("Area of circle "+ar);
       System.out.println("Circumference  of circle "+cir);
       
    }
    
}