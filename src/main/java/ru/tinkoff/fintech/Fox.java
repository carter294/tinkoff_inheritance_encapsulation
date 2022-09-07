package ru.tinkoff.fintech;

public class Fox extends Animal {

    public Fox(String name) {
        super(0);
        if (name.startsWith("F")) {
            super.setName(name);
        }
        else {
            System.exit(0);
        }
    }
}
