package stack;

public class Stack {

    private boolean isEmpty = true;
    private int actualSize = 0;


    public void push(int newElement) {
        setEmpty(false);
        addOneSize();
    }

    public void pop() {
        downOneSize();
        if (isEmpty()) setEmpty(true);
    }

    private void downOneSize() {
        actualSize--;
    }

    private void addOneSize() {
        actualSize++;
    }

    public boolean isEmpty() {
        isEmpty = size() == 0;
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public int size() {
        return actualSize;
    }
}
