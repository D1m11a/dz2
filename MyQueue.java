package Queue;

import java.util.NoSuchElementException;

public class MyQueue {

    private Object[] queue;
    private int front;
    private int rear;
    private int size;

    public MyQueue() {
        queue = new Object[10];
        size = 0;
        rear = -1;
        front = 0;
    }

    public int size() {
        return size;
    }
    public void clear(){
        size = 0;
        rear = -1;
        front = 0;
    }

    public void add(Object value) {
        if (size == queue.length) {
            increaseCapacity();
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;

    }

    private void increaseCapacity() {
        int newCapactity = queue.length * 2;
        Object[] newQueue = new Object[newCapactity];
        for (int i = 0; i < size; i++) {
            newQueue[i] = queue[i];
        }
        queue = newQueue;

    }
    public Object peek(){
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty.");
        }

        return queue[front];
    }
    public Object poll() {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty.");
        }
        Object element = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return element;
    }
}
