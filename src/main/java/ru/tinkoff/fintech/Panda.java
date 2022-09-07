package ru.tinkoff.fintech;

public class Panda extends Animal {

    public Panda(String name) {
        super(0);
        if (name.startsWith("P")) {
            super.setName(name);
        }
        else {
            System.exit(0);
        }
    }
}
