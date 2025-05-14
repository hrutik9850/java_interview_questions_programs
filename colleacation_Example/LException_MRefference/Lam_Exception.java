package colleacation_Example.LException_MRefference;
interface Match {
    void calculater ( int a , int b );
}
class Cal{
   static void calculater(Match mat ){
       mat.calculater(340,23);
   }
}
public class Lam_Exception {
   public static void main(String[] args) {
       // Pass lambda expression to calculater method
       Cal.calculater((a, b) -> {
           System.out.println(a + b);
           System.out.println("This is an addition operation.");
       });
   }
}
    

