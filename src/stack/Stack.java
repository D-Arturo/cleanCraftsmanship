package stack;

public class Stack {

    private boolean isEmpty = true;
    private int actualSize = 0;


    public void push(int newElement) {
        setEmpty(false);
        addOneSize();
    }

    public void pop() {
        setEmpty(true);
        downOneSize();
    }

    private void downOneSize() {
        actualSize--;
    }

    private void addOneSize() {
        actualSize++;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public int size() {
        return actualSize;
    }
}
