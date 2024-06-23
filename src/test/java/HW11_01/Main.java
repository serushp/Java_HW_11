package HW11_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number: ");
        int number = input.nextInt();

        EvenNumber evenNumber = new EvenNumber(number);
        Thread evenThread = new Thread(evenNumber);
        evenThread.start();

        OddNumber oddNumber = new OddNumber(number);
        Thread oddThread = new Thread(oddNumber);
        oddThread.start();

    }
}
