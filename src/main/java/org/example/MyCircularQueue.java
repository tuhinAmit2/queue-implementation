package org.example;

class MyCircularQueue {
    private int front, rear, size;
    private int[] queue;

    public MyCircularQueue(int k) {
        queue = new int[k];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Insert element at rear
    public boolean enQueue(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % queue.length; // wrap around
        queue[rear] = value;
        size++;
        return true;
    }

    // Delete element from front
    public boolean deQueue() {
        if (isEmpty()) return false;
        front = (front + 1) % queue.length; // move front forward
        size--;
        return true;
    }

    // Get front element
    public int Front() {
        if (isEmpty()) return -1;
        return queue[front];
    }

    // Get rear element
    public int Rear() {
        if (isEmpty()) return -1;
        return queue[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */