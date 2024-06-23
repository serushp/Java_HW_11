package HW11_01;

import java.util.ArrayList;
import java.util.List;

public class SharedResource {
    private List<Integer> allNumbers = new ArrayList<>();
    private boolean isEven = true;

    public synchronized void addEvenNumber(int number) {
        while (!isEven) {
           try {
               wait();
           }catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
        }
        allNumbers.add(number);
        isEven = false;
        notify();
    }

    public synchronized void addOddNumber(int number) {
        while (isEven) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        allNumbers.add(number);
        isEven = true;
        notify();
    }

    public List<Integer> getAllNumbers() {
        return allNumbers;
    }

}
