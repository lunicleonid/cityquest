package org.cityquest.core;

public abstract class Dimension<T> extends GenericOobject{
    protected T value;

    protected Dimension(String id) {
        super(id);
    }

    protected Dimension(String id, T value) {
        super(id);
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
