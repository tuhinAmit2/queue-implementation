package org.example;


class PriorityQueue {
    private NodeWithPriority front, rear; // front = head, rear = tail
    private int size;

    public PriorityQueue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    // Enqueue - add element to the rear
    public void enqueue(int data,int priority) {
        NodeWithPriority newNode = new NodeWithPriority(data, priority);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(data + " enqueued");
        sorttheQueueByPriority();
    }

    private void sorttheQueueByPriority() {
        if (front == null || front.next == null) {
            return; // No need to sort if the queue is empty or has only one element
        }

        // Bubble sort based on priority
        boolean swapped;
        do {
            swapped = false;
            NodeWithPriority current = front;
            while (current.next != null) {
                if (current.priority > current.next.priority) {
                    // Swap data and priority
                    int tempData = current.data;
                    int tempPriority = current.priority;
                    current.data = current.next.data;
                    current.priority = current.next.priority;
                    current.next.data = tempData;
                    current.next.priority = tempPriority;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }


    // Dequeue - remove element from front
    public int dequeue() {
        if (front == null) {
            throw new RuntimeException("Queue is empty");
        }
        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null; // if queue becomes empty
        }
        size--;
        return value;
    }

    // Peek - get front element
    public int peek() {
        if (front == null) {
            throw new RuntimeException("Queue is empty");
        }
        return front.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Get size
    public int size() {
        return size;
    }

    // Print queue elements
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        NodeWithPriority temp = front;
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
