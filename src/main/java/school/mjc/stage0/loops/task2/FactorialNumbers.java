package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 1, factorial = 1;
        System.out.println(1);
        while (count <= printToInclusive) {
            System.out.println(factorial *= count);
            count++;
        }
    }
}
