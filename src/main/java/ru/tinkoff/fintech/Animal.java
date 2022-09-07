package ru.tinkoff.fintech;

public class Animal {
    private int foodNeeded;
    private String name;
    int countEat;
    private double eatCount = 0;
    
    public Animal(int foodNeeded) {
        this.foodNeeded = foodNeeded;
    }

    public void eat(BagFood bagFood) {
        if (bagFood.getFood() >= foodNeeded) {
            eatCount++;
            bagFood.setFood(bagFood.getFood() - foodNeeded);
        }
        else {
            eatCount += (float) bagFood.getFood() / foodNeeded;
            bagFood.setFood(0);
        }
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getFoodNeeded() {
        return foodNeeded;
    }

    public void setFoodNeeded(int foodNeeded) {
        this.foodNeeded = foodNeeded;
    }

    public double getEatCount() {
        return eatCount;
    }
}
