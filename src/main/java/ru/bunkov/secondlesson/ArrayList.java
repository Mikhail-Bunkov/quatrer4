package ru.bunkov.secondlesson;

import java.util.Arrays;

public class ArrayList <E> implements List<E>{
    private final int INIT_SIZE = 8;
    private Object[] array = new Object[INIT_SIZE];
    private int size =0;

    @Override
    public void add(E value) {
        if(size == array.length-1)
            resize(array.length*2);
        array[size++] = value;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i<size; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
    }

    @Override
    public boolean contains(E value) {
        for (int i = 0; i < size; i++) {
            if(value.equals((E)array[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public void resize(int size) {
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, this.size);
        array = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < size; i++) {
            if(array[i]==null){
                break;
            }
            sb.append(" ").append(array[i].toString());
        }
        return sb.append(" }").toString();
    }
}
