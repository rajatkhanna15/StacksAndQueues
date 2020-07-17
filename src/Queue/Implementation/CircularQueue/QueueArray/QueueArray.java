package Queue.Implementation.CircularQueue.QueueArray;

/**
 * QueueArray class for the implementation of various methods of Queue.
 * The three basic methods are : 1. insert() method to insert an element from the rear of the queue.
 *                               2. remove() method to delete an element from the front of the queue.
 *                               3. peek() method to return the element at front of the queue.
 */
public class QueueArray {
    /**
     * Instance variables: 1. maxSize to store the maximum size of queue.
     *                     2. intArray[] to store the data elements.
     *                     3. front to store the index of topmost element.
     *                     4. rear to store the index of last element.
     *                     5. nElems to store the number of data items.
     */
    private int maxSize;
    private int[] intArray;
    private int front;
    private int rear;
    private int nElems;

    /**
     * parametrised constructor to initialise the values and declare the array.
     * @param max the max
     */
    QueueArray(int max)
    {
        maxSize = max;
        intArray = new int[maxSize];
        front = 0;
        rear = -1;
        nElems = 0;
    }

    /**
     * insert() method to insert the values in the queue.
     * @param value the value
     */
    public void insert(int value)
    {
        if(rear == maxSize - 1)                              //wraparound
            rear = -1;
        intArray[++rear] = value;
        nElems ++;
    }
}
