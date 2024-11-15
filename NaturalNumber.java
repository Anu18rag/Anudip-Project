class EvenNumbersThread extends Thread {
    public void run() {
        System.out.println("Even numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class OddSquaresThread extends Thread {
    public void run() {
        System.out.println("Squares of odd numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i * i);
            }
        }
    }
}

class EvenCubesThread extends Thread {
    public void run() {
        System.out.println("Cubes of even numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i * i * i);
            }
        }
    }
}

class MultiplesOfTenThread extends Thread {
    public void run() {
        System.out.println("Multiples of 10:");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i * 10);
        }
    }
}

public class NaturalNumber{
    public static void main(String[] args) {
        EvenNumbersThread evenThread = new EvenNumbersThread();
        OddSquaresThread oddSquareThread = new OddSquaresThread();
        EvenCubesThread evenCubeThread = new EvenCubesThread();
        MultiplesOfTenThread multipleThread = new MultiplesOfTenThread();

        evenThread.start();
        oddSquareThread.start();
        evenCubeThread.start();
        multipleThread.start();
    }
}