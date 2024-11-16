package org.example.model;

public enum Coin {
    One(1),
    Two(2);
    public final int val;
    Coin(int val)
    {
        this.val = val;
    }
    int getValue()
    {
        return val;
    }
}
