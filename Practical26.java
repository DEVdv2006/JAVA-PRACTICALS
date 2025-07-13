class EvenNumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

class OddNumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

public class Practical26 {
    public static void main(String[] args) {
        EvenNumberThread evenThread = new EvenNumberThread();
        OddNumberThread oddThread = new OddNumberThread();
        
        evenThread.start();
        oddThread.start();
    }
}