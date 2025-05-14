package string_program;

public class Repetate_ArrayValue {
    public static void repitate(int[] arry) {
        int value;
        int[] repity = new int[arry.length];
        int index = 0;

        for (int i = 0; i < arry.length; i++) {
            value = arry[i];    // get the value of the current element

            for (int j = i + 1; j < arry.length; j++) {  // correct loop
                if (value == arry[j]) {

                    boolean alreadyExists = false;
                    for (int k = 0; k < index; k++) {// check if the value already exists in repity
                        if (repity[k] == value) {
                            alreadyExists = true;// if it exists, set alreadyExists to true
                            break;
                        }
                    }

                    if (!alreadyExists) {
                        repity[index] = value;
                        index++;
                    }

                    break;  // found duplicate, no need to check further for this value
                }
            }
        }

        System.out.print("Repeated elements: ");
        for (int i = 0; i < index; i++) {
            System.out.print(repity[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arry = {22, 4, 5, 3, 4, 5, 2, 3, 192, 1};
        Repetate_ArrayValue.repitate(arry);
    }
    
}
