package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void printFactorialRow(int printToInclusive) {

        int i = 1;
        int fact = 1;

        if (printToInclusive > 0) {

            while (i <= printToInclusive) {

                fact = fact * i;
                System.out.println(fact);
                i++;

            }

        } else {
            System.out.println(fact);
        }
    }
    public static void main(String[] args) {
        printFactorialRow(7);
        printFactorialRow(0);
    }
}
