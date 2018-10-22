package stacksQueues;

public interface CircularQueue<E> extends Queue<E> {
    /**
     * Rotates the front element to the back of the queue
     * This does nothing if the queue is empty
     */
    void rotate();
}
