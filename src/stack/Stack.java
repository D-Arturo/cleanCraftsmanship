package stack;

public class Stack {

    private boolean isEmpty = true;
    private int actualSize = 0;
    private int currentValue;


    public void push(int newElement) {
        setEmpty(false);
        addOneSize();
        currentValue = newElement;
    }

    public int pop() {
        if (isEmpty()) throw new Underflow();
        downOneSize();
        if (isEmpty()) setEmpty(true);
        return currentValue;
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
