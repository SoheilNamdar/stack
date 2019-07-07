class MyStack {

    private int size = 0;

    boolean isEmpty() {
        return true;
    }

    void push() {
        size += 1;
    }

    int size() {
        return size;
    }

    void pop() {
        size -= 1;
    }
}
