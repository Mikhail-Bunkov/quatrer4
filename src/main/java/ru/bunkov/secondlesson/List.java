package ru.bunkov.secondlesson;

public interface List <E>{
    void add(E value);
    void remove(int index);
    boolean contains(E value);
    int size();
    boolean isEmpty();
    E get(int index);
    void resize(int size);
}
