package org.example;

class Queue {
    private Node front, rear; // front = head, rear = tail
    private int size;

    public Queue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    // Enqueue - add element to the rear
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(data + " enqueued");
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
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
