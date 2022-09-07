package ru.tinkoff.fintech;

public class Rabbit extends Animal {

    public Rabbit(String name) {
        super(0);
        if (name.startsWith("R")) {
            super.setName(name);
        }
        else {
            System.exit(0);
        }
    }
}
