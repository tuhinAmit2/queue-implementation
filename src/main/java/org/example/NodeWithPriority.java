package org.example;

class NodeWithPriority {
    int data;
    int priority;
    NodeWithPriority next;

    public NodeWithPriority(int data,int priority) {
        this.data = data;
        this.next = null;
        this.priority=priority;
    }
}