public class Main {
    public Main() {
    }

    public static void main(String[] var0) {

//        Stack var1 = new Stack(10);
//        var1.push(20L);
//        var1.push(40L);
//        var1.push(60L);
//        var1.push(80L);
//        var1.push(100L);
//
//        while(!var1.isEmpty()) {
//            long var2 = var1.pop();
//            System.out.print(var2);
//            System.out.print(" ");
//        }
//
//        System.out.println(" ");

//--------------------------------------------------------------------------------------------------------

//        Queue myqueue = new Queue(5);
//        myqueue.insert(1);
//        myqueue.insert(2);
//        myqueue.insert(3);
//        myqueue.insert(4);
//        myqueue.insert(5);
//
//        while (!myqueue.isEmpty()) {   // remove and display all items
//            long n = myqueue.remove(); //  (40, 50, 60, 70, 80)
//            System.out.print(n + " ");
//        }
//        System.out.println(" ");
//        System.out.println(myqueue.peekFront());

//--------------------------------------------------------------------------------------------------------

//        PriorityQueue thePQ = new PriorityQueue(5);
//        thePQ.insert(30);
//        thePQ.insert(50);
//        thePQ.insert(10);
//        thePQ.insert(40);
//        thePQ.insert(20);
//
//        while(!thePQ.isEmpty()) {
//            long item = thePQ.remove();
//            System.out.print(item + " ");  // 10, 20, 30, 40, 50
//        }
//        System.out.println(" ");

//--------------------------------------------------------------------------------------------------------

        String inputString = "Hello";
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + StringReverser.reverse(inputString));


    }
}