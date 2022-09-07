package ru.tinkoff.fintech;

import java.util.Arrays;

public class Zoo {
    public void countFood(BagFood bagFood) {

    }

    public boolean foodBagIsEmpty(BagFood bagFood) {
        return bagFood.getFood() == 0;
    }

    public void feedAnimals(BagFood bagFood) {
        Animal[] zoo =  { new Panda("Po"), new Rabbit("Robert"), new Fox("Fiona") };
        zoo[0].setFoodNeeded(200);
        zoo[1].setFoodNeeded(5);
        zoo[2].setFoodNeeded(21);
        while(!foodBagIsEmpty(bagFood)) {
            Arrays.stream(zoo).forEach(it -> it.eat(bagFood));
        }
        Arrays.stream(zoo).forEach(it -> System.out.println(it.getName() + " \u043f\u043e\u0435\u043b " + it.getEatCount() + " \u0440\u0430\u0437"));
    }

}
