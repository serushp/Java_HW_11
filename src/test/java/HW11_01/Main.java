package HW11_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number: ");
        int number = input.nextInt();

        SharedResource sharedResource = new SharedResource();
        Thread evenThread = new Thread(new EvenNumber(number, sharedResource));
        Thread oddThread = new Thread(new OddNumber(number, sharedResource));

        evenThread.start();
        oddThread.start();

        evenThread.join();
        oddThread.join();
        System.out.println("all Numbers is: " +sharedResource.getAllNumbers());

    }
}
