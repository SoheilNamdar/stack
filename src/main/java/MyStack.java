class MyStack {

    private int size = 0;
    private int limit;

    MyStack(int limit) {
        this.limit = limit;
    }

    boolean isEmpty() {
        return true;
    }

    void push() {
        if(size < limit) {
            size += 1;
        } else {
            throw new StackSizeOverflowsException();
        }
    }

    int size() {
        return size;
    }

    void pop() {
        if (size > 0) {
            size -= 1;
        } else {
            throw new StackUnderFlowsException();
        }
    }
}
