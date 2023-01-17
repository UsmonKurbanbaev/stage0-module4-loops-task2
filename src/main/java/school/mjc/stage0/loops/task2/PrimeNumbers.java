package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive == 2) {
            System.out.println("2");
        }
        if (printToInclusive >= 3) {
            System.out.println("2\n" + "3");
            int n = 5;
            while (n < printToInclusive) {
                int m = (int) Math.sqrt(n);
                boolean check = true;
                while (m != 1) {
                    if (n % m == 0) {
                        check = false;
                        break;
                    }
                    m--;
                }
                if (check) {
                    System.out.println(n);
                }
                n += 2;
            }
        }
    }
}