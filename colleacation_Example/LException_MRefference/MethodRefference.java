package colleacation_Example.LException_MRefference;
interface Cnusumer {
    void message(int a , int b );
}
class util {
   public static void message(int a , int b){
       System.out.println(a + b);
       
   }
}
class MethodRefference {
   public static void main(String[] args) {
     Cnusumer cn = util::message ;
     cn.message(20 ,30);
   }
}
// it is a method reference in main class
