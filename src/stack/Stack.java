package stack;

public class Stack {

    private int actualSize = 0;
    private final int[] currentValue = new int[2];


    public void push(int newElement) {
        if (size() + 1 >= 3) throw new Overflow();
        currentValue[size()] = newElement;
        increaseStackSizeByOne();
    }

    public int pop() {
        if (isEmpty()) throw new Underflow();
        decreaseSizeByOne();
        return currentValue[size()];
    }

    private void decreaseSizeByOne() {
        actualSize--;
    }

    private void increaseStackSizeByOne() {
        actualSize++;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return actualSize;
    }

    public class Underflow extends RuntimeException {
    }

    public class Overflow extends RuntimeException {

    }
}
