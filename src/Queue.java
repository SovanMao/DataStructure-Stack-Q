class Queue <T> {
    private int maxSize;
    private T[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {         // constructor
        maxSize = s;
        queArray = (T[]) new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(T j) {  // put item at rear of queue
        if (rear == maxSize-1)    // deal with wraparound
            rear = -1;
        queArray[++rear] = j;     // increment rear and insert
        nItems++;                 // one more item
    }

    public T remove() {        // take item from front of queue
        T temp = queArray[front++]; // get value and incr front
        if (front == maxSize)     // deal with wraparound
            front = 0;
        nItems--;                 // one less item
        return temp;
    }

    public T peekFront() {     // peek at front of queue
        return queArray[front];
    }

    public T peekRear() {     // peek at rear of queue
        return queArray[rear];
    }

    // Display method
    public void display() {
        for (int i = 0; i < nItems; i++) {
            System.out.println(queArray[(front + i) % queArray.length]);
        }
    }

    // toString method
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nItems; i++) {
            sb.append(queArray[(front + i) % queArray.length]).append(" ");
        }
        return sb.toString();
    }

} // end class Queue