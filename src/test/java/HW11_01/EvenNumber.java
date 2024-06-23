package HW11_01;

public class EvenNumber implements Runnable {
    private int number;
    SharedResource sharedResource;

    public EvenNumber(int number, SharedResource sharedResource) {
        this.number = number;
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 0; i <= number; i += 2) {
            sharedResource.addEvenNumber(i);
        }
    }
}
