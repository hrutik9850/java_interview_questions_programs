package java_Topik_program.Muitithreading;
public class SingalThreadModelApplication {
    
    public static void main(String[] args) {
        SingalThredModel model = new SingalThredModel();
        long time1 = System.currentTimeMillis();
        model.print1To100();

        System.err.println();
        model.print100To1();

        System.err.println("Execution time: " + (System.currentTimeMillis() - time1) + " milliseconds");
        System.out.println("End of the program");
       
    }
    
}
