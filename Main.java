package jadv.task_2_1;

public class Main {
    public static final int BUYERS = 10;

    public static void main(String[] args) {
        final AutoShow salesman = new AutoShow();
        for (int i = 0; i < BUYERS; i++) {
            new Thread(null, salesman::sellCar, "Покупатель " + (i + 1)).start();
        }
        new Thread(null, salesman::receiveCar, "Производитель").start();
    }
}
