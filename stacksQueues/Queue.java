package stacksQueues;

public interface Queue<E> {

    /** Returns the number of elements in queue */
    int size();

    /** Tests whether the queue is empty */
    boolean isEmpty();

    /** Inserts an element at the rear of the queue */
    void enqueue(E e);

    /** Returns but not removes the first element of the queue (null if empty) */
    E first();

    /** Removes and returns the first element (null if empty) */
    E dequeue();
}
