//package quiz5;

public class Stack<Integer> {
     int size = 0;
     static final int capacity = 10;
     int[] stack;

    public Stack() {
        stack = new int[capacity];
    }

    public void push(int numbers) {
        stack[size++] = numbers;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        if (size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(size == capacity){
            return true;
        }
        else{
            return false;
        }
    }

    public int top() {
        int numbers = stack[--size];
        size = size+1;
        return numbers;
    }

    public int pop() {
        int numbers = stack[--size];
        stack[size] = 0;
        return numbers;
    }


 }
