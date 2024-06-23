package HW11_01;

public class OddNumber implements Runnable {
    private int number;
    SharedResource sharedResource;

    public OddNumber(int number, SharedResource sharedResource) {
        this.number = number;
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 1; i <= number; i += 2) {
            sharedResource.addOddNumber(i);
        }
    }
}
