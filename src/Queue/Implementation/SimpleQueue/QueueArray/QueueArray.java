package Queue.Implementation.SimpleQueue.QueueArray;

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

}
