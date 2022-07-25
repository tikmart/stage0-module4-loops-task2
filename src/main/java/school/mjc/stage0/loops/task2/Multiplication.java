package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void printMultiplied(int multiplyByAndToInclusive) {

    int counter = 0;

    while (Math.abs(counter) <= Math.abs(multiplyByAndToInclusive)){
        System.out.println(counter * multiplyByAndToInclusive);
        counter++;

    }

    }

    public static void main(String[] args) {
        printMultiplied(5);
        printMultiplied(-5);
        printMultiplied(0);
    }
}
