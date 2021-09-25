
import java.util.Scanner;
import java.lang.Thread;
class X implements Runnable{
    public void run(){
        Scanner reader=new Scanner(System.in);
        int n , a= 0,b= 1,c;
        System.out.println("Enter the limit:");
         n=reader.nextInt();
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(a + ", ");

      // compute the next term
      c = a+ b;
      a= b;
      b = c;
    }
    }
}
class Y implements Runnable{
    public void run(){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the  starting limit:"); 
        int n1=reader.nextInt();
        System.out.println("Enter the  ending limit:"); 
        int n2=reader.nextInt();
        System.out.println("Even numbers in the range:"); 
        for(int i=n1;i<=n2;i++){
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}
public class ThreadRunnable {

    
    public static void main(String[] args) {
        X obj1 =new X();
        Thread t1=new Thread (obj1);
        
        
        Y obj2 =new Y();
        Thread t2=new Thread (obj2);
        
        
            t1.start();
            t2. start();
    }
    
}
