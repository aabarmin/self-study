package ru.mydesignstudio.generics;

public class GenericExtendTest<T extends Number> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
