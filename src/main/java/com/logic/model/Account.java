package com.logic.model;

import java.io.Serializable;

public class Account implements Serializable {

    private int id;
    private int example;

    public Account(int example) { //useful constructor
        this.example = example;
    }

    public Account(int id, int example) {
        this.id = id;
        this.example = example;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExample() {
        return example;
    }

    public void setExample(int example) {
        this.example = example;
    }
}
