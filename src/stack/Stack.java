package stack;

public class Stack {

    private boolean isEmpty = true;
    private int actualSize = 0;
    private final int[] currentValue = new int[2];


    public void push(int newElement) {
        setEmpty(false);
        currentValue[size()] = newElement;
        addOneSize();
    }

    public int pop() {
        if (isEmpty()) throw new Underflow();
        if (isEmpty()) setEmpty(true);
        downOneSize();
        return currentValue[size()];
    }

    private void downOneSize() {
        actualSize--;
    }

    private void addOneSize() {
        actualSize++;
    }

    public boolean isEmpty() {
        return isEmpty = size() == 0;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public int size() {
        return actualSize;
    }

    public class Underflow extends RuntimeException {
    }
}
