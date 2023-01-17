package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int count = 1, result = 1;
        if(power < 0){
            System.out.println("too much power");
        } else {
            System.out.println("1");
            while (count <= power) {
                System.out.println(result *= 2);
                count ++;
            }
        }
    }
}
