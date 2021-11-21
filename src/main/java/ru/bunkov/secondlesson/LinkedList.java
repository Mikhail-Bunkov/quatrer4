package ru.bunkov.secondlesson;

public interface LinkedList<E>  {

    void insertFirst(E value);

    E removeFirst();

    void insertLast(E value);


    boolean remove(E value);

    boolean contains(E value);

    int size();

    boolean isEmpty();

    void display();

    E getFirst();

    E getLast();

    class Node<E> {
        E item;
        Node<E> next;
        Node<E> previous;

        public Node(E item, Node<E> next) {
            this(item, next, null);
        }

        public Node(E item, Node<E> next, Node<E> previous) {
            this.item = item;
            this.next = next;
            this.previous = previous;
        }
    }
}
