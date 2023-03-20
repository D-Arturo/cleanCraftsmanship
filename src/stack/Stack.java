package stack;

public class Stack {

    private boolean isEmpty = true;
    private int actualSize = 0;
    private final int[] currentValue = new int[2];


    public void push(int newElement) {
        setEmpty(false);
        if (size() + 1 >= 3) throw new Overflow();
        currentValue[size()] = newElement;
        increaseStackSizeByOne();
    }

    public int pop() {
        if (isEmpty()) throw new Underflow();
        if (isEmpty()) setEmpty(true);
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

    public class Overflow extends RuntimeException {

    }
}
