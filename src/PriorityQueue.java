class PriorityQueue<T> {
    private int maxSize;
    private T[] queueArray;
    private int[] priorityArray;
    private int nItems;

    public PriorityQueue(int arraySize) {  // Constructor
        maxSize = arraySize;
        queueArray = (T[]) new Object[maxSize];
        priorityArray = new int[maxSize];
        nItems = 0;
    }

    public void insert(T newItem, int priorityValue) {  // Insert item with priority
        if (nItems == maxSize) {
            System.out.println("Priority queue is full");
            return;
        }
        int i;
        // If the queue is empty, directly insert the first item
        if (nItems == 0) {
            queueArray[nItems] = newItem;
            priorityArray[nItems] = priorityValue;
            nItems++;
        } else {
            
            for (i = nItems - 1; i >= 0; i--) {
                if (priorityValue > priorityArray[i]) {
                    // Shift items to the right to make space for the new item
                    queueArray[i + 1] = queueArray[i];
                    priorityArray[i + 1] = priorityArray[i];
                } else {
                    break;
                }
            }
            //Inserting new item
            queueArray[i + 1] = newItem;
            priorityArray[i + 1] = priorityValue;
            nItems++;
        }
    }

    public T remove() {  // Remove item with highest priority
        if (nItems == 0) {
            System.out.println("Priority queue is empty");
            return null;
        }
        return queueArray[--nItems]; // Decrement nItems and then return the item
    }

    public T peekFront() {  // Peek at front of queue
        if (nItems == 0) {
            System.out.println("Priority queue is empty");
            return null;
        }
        return queueArray[nItems - 1];
    }

    public T peekRear() {  // Peek at rear of queue
        if (nItems == 0) {
            System.out.println("Priority queue is empty");
            return null;
        }
        return queueArray[0];
    }

    public String toString() {  // Return string representation of queue
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nItems; i++) {
            sb.append("(").append(queueArray[i]).append(", ").append(priorityArray[i]).append(") ");
        }
        return sb.toString();
    }

    public void display() {  // Display all items in the queue
        for (int i = 0; i < nItems; i++) {
            System.out.println("(" + queueArray[i] + ", " + priorityArray[i] + ")");
        }
    }
}
