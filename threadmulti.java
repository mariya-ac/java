
import java.util.Scanner;
    class tmultiple extends Thread
    {
        public void run()
        {
            System.out.println("Multiplication table of 5");
            for(int i=1;i<=10;i++)
            {
                System.out.println(i+ " * 5 = " +i*5);
            }
            System.out.println();
        }
    }

    class tprime extends Thread
    {
        public void run()
        {
            int i,j;
            Scanner reader=new Scanner(System.in);
            System.out.print("Enter the limit: ");
            int n=reader.nextInt();
            System.out.print("Prime numbers up to "+n+" are: ");
            for(i=2;i<=n;i++)
            {
                int count=0;
                for(j=1;j<=i;j++)
                {
                    if(i%j==0)
                        count=count+1;
                }
                if(count==2)
                    System.out.print(i+"  ");
            }
        }
    }
     class threadmulti
     {
        public static void main(String args[])
        {
            new tmultiple().start();
            new tprime().start();
        }
    }