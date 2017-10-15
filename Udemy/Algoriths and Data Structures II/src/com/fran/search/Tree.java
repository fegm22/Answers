package com.fran.search;

public interface Tree<T> {
    public T getMaxValue();

    public T getMinValue();

    public void insert(T value);

    public void delete(T value);

    public void traversal();

    public boolean checkBST();
    public boolean checkBST(T min, T max);
}
