package QueueNumber;
public class Queue {

    private static Queue instance;

    private int currentNumber;

    private Queue(){
        currentNumber = 0;
    }

    public static synchronized Queue getInstance(){
        if (instance == null) {
            instance = new Queue();
        }
        return instance;
    }


    public synchronized int nextNumber() {
        currentNumber++;
        return currentNumber;
    }
    public synchronized void resetNumber(int resetValue) {
        currentNumber = resetValue;
    }
    public synchronized int getNumber() {
        return currentNumber;
    }

}