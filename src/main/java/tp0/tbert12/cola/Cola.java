package tp0.tbert12.cola;

public class Cola<T> implements Queue {
    private InterfaceNode first = new NullNode();

    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }

    @Override
    public int size() {
        return first.countNexts();
    }

    @Override
    public void add(Object item) {
        first = first.appendNext(new Node(item));
    }

    @Override
    public Object top() {
        return first.getContent();
    }

    @Override
    public void remove() {
        first = first.getNextNode();
    }
}
