class Stack<T> {
    private int maxSize;        // size of stack array
    private T[] stackArray;
    private int top;            // top of stack

    public Stack(int s) {              // constructor
        maxSize = s;                    // set array size
        stackArray = (T[]) new Object[maxSize]; // create array
        top = -1;                       // no items yet
    }

    public void push(T j) {          // put item on top of stack
        stackArray[++top] = j;          // increment top, insert item
    }

    public T pop() {                 // take item from top of stack
        return stackArray[top--];       // access item, decrement top
    }

    public T peek() {                // peek at top of stack
        return stackArray[top];
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }

    // toString method
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(stackArray[i]).append(" ");
        }
        return sb.toString();
    }

} // end class StackX