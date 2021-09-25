
import java.util.Scanner;

class Cpu{

 
 int price;


  
  
  class Processor{                        //inner class  Processor
               
               String Manufacturer, No_of_Cores;

                 }


   
   static class Ram{                      //static class Ram
                /* A static nested class cannot access non static members of outer class. 
                  A static nested class may be instantiated without instantiating its outer class  
                */
         
              String Manufacturer;
              int memory;
       
                    }

    Cpu.Ram RAMobject = new Cpu.Ram();                      // created object of static class Ram 

    Processor PROCESSOR = new Processor();                      //created object of Processor
    
  

    void inputData(){ 

    
      Scanner in = new Scanner(System.in);
   
        System.out.println("Enter The CPU Details\n");    
    
        System.out.print("Enter RAM Manufacture Name : ");
         RAMobject.Manufacturer=in.next();
 
        System.out.print("Enter RAM Memory : ");
         RAMobject.memory=in.nextInt();
        
          
        System.out.print("Enter Processor Manufacture Name : ");
         PROCESSOR.Manufacturer=in.next();
 
        System.out.print("Enter No.Of.Cores : ");
         PROCESSOR.No_of_Cores=in.next();

        System.out.print("Enter CPU Price : ");
        price=in.nextInt();
    }


   void display(){
        
        System.out.println("\nCPU Details");       
       
        System.out.println("\nRAM Manufacture Name : "+ RAMobject.Manufacturer);
       
        System.out.println("RAM Memory : "+ RAMobject.memory);
        
        System.out.println("Processor Manufacture Name : "+ PROCESSOR.Manufacturer);
       
        System.out.println("No.Of.Cores : "+ PROCESSOR.No_of_Cores);

        System.out.println("CPU Price : "+ price);
        
 
   }



}


class Computer{

public static void main(String args[]){

   Cpu NEWCPU = new Cpu();                           // CREATING OBJECT OF Cpu
  
   NEWCPU.inputData();                              //CALLING INPUT FUNCTION
   
   NEWCPU.display();                               // CALLING DISPLAY FUNCTION


}}