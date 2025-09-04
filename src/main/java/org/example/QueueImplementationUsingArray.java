package org.example;

import java.util.Scanner;

public class QueueImplementationUsingArray {
    private static int front = -1;
    private static int rear = -1;
    private static int size;
    private static int[] queue;

    public static void implementQueue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        size = sc.nextInt();
        queue = new int[size];

        while (true) {
            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = sc.nextInt();
                    enqueue(value);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Overflow: Queue is full");
            return;
        }
        if (front == -1) front = 0; // first element
        queue[++rear] = value;
        System.out.println("Enqueued: " + value);
    }

    private static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Underflow: Queue is empty");
            return;
        }
        System.out.println("Dequeued: " + queue[front]);
        front++;
        if (front > rear) { // reset when queue is empty
            front = rear = -1;
        }
    }

    private static void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
