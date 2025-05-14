package colleacation_Example.LException_MRefference;
@FunctionalInterface
interface Abc1{ // it is a functional interface non parameter
    void abc();
}
@FunctionalInterface
interface Abc2{ // it is a functional interface parameter
    void abc(int a);
}
class A1{           // it is a class for method reference
    static void m1(){   
        System.out.println("A1 m1() Hi ");
    }
    static void m1(int a){
        System.out.println("A1 m1(int ) "+a);
    }
      void m2(){
        System.out.println("A1  NSM m2() Hallo ");
    }
     void m2(int a){
        System.out.println("A1 NSM m2(int ) "+a);
    }
    A1(){
        System.out.println("A1 NPC ");
    }
    A1(int a ){
        System.out.println("A1 IPC "+a);
    }
}
public class ExampleLamdaExceptionMethodRefference {    // it is a main class for method reference
    // it is a main class for method 
    public static void main(String[] args) {
      Abc1 a1 = () -> { //lambda expression
          System.out.println("LE m1"); // it is a call in main class
      };
      a1.abc();
      //========================================
      Abc1 a2 = () -> {A1.m1();}; // lambda expression
      a2.abc();
      
      Abc1 a3 = A1::m1;     // method reference static method 
      a3.abc();
      //======================================  parameter metods 
      Abc2 a5 = a  -> A1.m1(a) ;    // lambda expression
      a5.abc(40);
      
      Abc2 a4 = A1::m1 ;    // method reference static method with parameter
      a4.abc(30);
      // =================================Non static methods  NOP
      Abc1 a6 = ()  -> new A1().m2();   // lambda expression
      a6.abc();
      
      Abc1 a7 = new A1()::m2;       // method reference non static method
      a7.abc();
      //================================Non static methods Parameter
      Abc2 a8 = (a)-> new A1().m2(a);   // lambda expression
      a8.abc(50);
      
      Abc2 a9 = new A1():: m2;      // method reference non static method with parameter
      a9.abc(60);
      // =======================================constructer only call no parameter
      Abc1 a10 = () -> { new A1();};            
      a10. abc();
       
       Abc1 a11 = A1:: new ;
       a11.abc();
       //==================================== parameter constructer 
       Abc2 a12 = (a) ->{new A1(a);};
       a12.abc(70);
       
       Abc2 a13 = A1:: new ;
       a13.abc(80);
      
      
      
      
      }
}
    

