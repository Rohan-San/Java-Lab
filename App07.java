public class App07 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5);
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));
        producerThread.start();
        consumerThread.start();
    }
}

class SharedBuffer {
    private int[] buffer;
    private int size;
    private int count;

    public SharedBuffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.count = 0;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (count == size) {
            wait();      // Buffer is full, wait for the consumer to consume
        }
        buffer[count++] = item;
        System.out.println("Produced: " + item);
        notify();       // Notify the consumer that an item is produced
    }

    public synchronized int consume() throws InterruptedException {
        while (count == 0) {
            wait();     // Buffer is empty, wait for the producer to produce
        }
        int item = buffer[--count];
        System.out.println("Consumed: " + item);
        notify();       // Notify the producer that an item is consumed
        return item;
    }
}

class Producer implements Runnable {
    private SharedBuffer buffer;
    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
                Thread.sleep(1000); // Simulate production time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private SharedBuffer buffer;
    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                int item = buffer.consume();
                Thread.sleep(1500); // Simulate consumption time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// output:
// Produced: 1
// Consumed: 1
// Produced: 2
// Consumed: 2
// Produced: 3
// Produced: 4
// Consumed: 4
// Produced: 5
// Consumed: 5
// Consumed: 3
