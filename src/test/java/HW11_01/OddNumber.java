package HW11_01;

public class OddNumber implements Runnable {
    private int number;

    public OddNumber(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= number; i += 2) {
            System.out.println("OddNumber: " + i);
        }
    }
}
