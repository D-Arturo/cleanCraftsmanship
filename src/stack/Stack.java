package stack;

public class Stack {

    private boolean isEmpty = true;

    public void push(int newElement) {
        setEmpty(false);
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
