package ru.Mikhail.Busygin.builder.partialBuilders;

import ru.Mikhail.Busygin.builder.Pizza;
import ru.Mikhail.Busygin.builder.PizzaBuilder;

public class CheapPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;
    @Override
    public Pizza reset() {
        pizza = new Pizza();
        return pizza;
    }

    @Override
    public PizzaBuilder addMeat() {
        pizza.setMeat("Sausage");
        return this;
    }

    @Override
    public PizzaBuilder addCucumbers() {
        pizza.setMeat("Without cucumbers");
        return this;
    }

    @Override
    public PizzaBuilder addOlives() {
        pizza.setMeat("Without olives");
        return this;
    }

    @Override
    public PizzaBuilder addMushrooms() {
        pizza.setMeat("Without mushrooms");
        return this;
    }
}
