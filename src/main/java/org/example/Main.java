package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //QueueImplementationUsingArray.implementQueue();
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());

        if(!queue.isEmpty()){
            queue.display();
        }

        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.enqueue(10,2);
        priorityQueue.display();
        priorityQueue.enqueue(20,1);
        priorityQueue.display();
        priorityQueue.enqueue(30,3);
        priorityQueue.display();
        priorityQueue.display();

        System.out.println("Dequeued: " + priorityQueue.dequeue());
        System.out.println("Front element: " + priorityQueue.peek());
        System.out.println("Queue size: " + priorityQueue.size());
        if(!priorityQueue.isEmpty()){
            priorityQueue.display();
        }

    }
}