import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class FixedQueue<T> extends ArrayBlockingQueue<T> {

    private int size;
    private ArrayBlockingQueue<T> q;

    /*
    FixedQueue() {
        super(10);
    }*/


    FixedQueue(int size) {
        super(size);
    }

    @Override
    public boolean add(T e) {
        if (!offer(e)) {
            poll();
            offer(e);
            return false;
        } else {
            return true;
        }
    }
}
