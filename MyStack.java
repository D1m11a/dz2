package Stack;

import java.util.NoSuchElementException;

public class MyStack {

    private Object[] stack;
    private int top;
    private int size;

    public MyStack() {
        Object[] stack = new Object[10];
        int top = -1;
        int size = 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        top = -1;
        size = 0;
    }
    public void push(Object value){
        if (size > stack.length){
            increaseCapacity();
        }
        top++;
               stack[top] = value;
               size++;
    }

    public Object pop(){
        if (size == 0){
            throw new NoSuchElementException("Stack is empty");
        }
        Object element = stack[top];
        top--;
        size--;
        return element;
    }
    public Object peek() {
        if (size == 0) {
            throw new NoSuchElementException("Stack is empty");
        }
        return stack[top];
    }
    private void increaseCapacity(){
        int newCapacity = size * 2;
        Object [] newStack = new Object [newCapacity];
        for (int i = 0; i <= top; i++){
newStack [i] = stack [i];
        }
        stack = newStack;
    }
}
