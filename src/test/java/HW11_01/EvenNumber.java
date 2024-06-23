package HW11_01;

public class EvenNumber implements Runnable {
    private int number;

    public EvenNumber(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 0; i <= number; i += 2) {
            System.out.println("Even Number: " + i);
        }
    }
}
