package Stack.Implementation.Stackshow;

/**
 * This is the class for showing the Stack implementation.
 * There are three operations in the stack:
 * 1. push - to put item on top of stack.
 * 2. pop - to remove item from the top of stack.
 * 3. peek - to access the element at topmost index of stack.
 */
public class StackShow {
    /**
     * instance variables.
     * intArray[] to store the data items.
     * nElems to store the number of data items.
     * top to store the index of topmost element.
     */
    private int[] intArray;
    private int nElems, top = -1;

    /**
     * Parametrised constructor to declare the array with size as max and initialise nElems to 0 and top to -1.
     * @param max the max
     */
    public StackShow(int max)
    {
        intArray = new int[max];
        nElems = 0;
        top = -1;
    }

    /**
     * push() method to push the value in the array at top.
     * @param value the value to be pushed.
     */
    public void push(int value)
    {
        intArray[++top] = value;                   //increment top ,insert the value.
    }

    /**
     * pop() method to return the element at topmost index and delete it from the array.
     * @return element at top.
     */
    public int pop()
    {
        return intArray[top --];                         // access item, decrement top
    }

    /**
     * peek() method to return the element at topmost index,without removing it.
     * @return element at top.
     */
    public int peek()
    {
        return intArray[top];                             //access item only.
    }

    /**
     * isEmptu() method to check whether the stack is empty or not.
     */
    public boolean isEmpty()
    {
        return top == -1 ;
    }

    /**
     * isFull() method to check whether the stack is full or not.
     */
    public boolean isFull()
    {
        return top == nElems-1;
    }



}
