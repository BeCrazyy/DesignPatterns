package behavioral.Iterator;

public interface Aggregator<T> {
    Iterator<T> createIterator();
}
