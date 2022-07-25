package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void printPower(int power) {
        int i = 0;
        int two = 2;
        int result;

        if (power >= 0) {
        while (i <= power) {
            result = (int) Math.pow(two,i);
            System.out.println(result);
            i++;

        }

        }else {
            System.out.println("too much power");




        }

    }

    public static void main(String[] args) {
        printPower(4);
        printPower(0);
        printPower(-9);
    }
}
