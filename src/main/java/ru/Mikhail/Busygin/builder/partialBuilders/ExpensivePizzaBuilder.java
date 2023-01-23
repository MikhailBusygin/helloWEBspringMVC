package ru.Mikhail.Busygin.builder.partialBuilders;

import ru.Mikhail.Busygin.builder.Pizza;
import ru.Mikhail.Busygin.builder.PizzaBuilder;

public class ExpensivePizzaBuilder implements PizzaBuilder {
    private Pizza pizza;
    @Override
    public Pizza reset() {
        pizza = new Pizza();
        return pizza;
    }

    @Override
    public PizzaBuilder addMeat() {
        pizza.setMeat("Bacon + Salami");
        return this;
    }

    @Override
    public PizzaBuilder addCucumbers() {
        pizza.setMeat("With cucumbers");
        return this;
    }

    @Override
    public PizzaBuilder addOlives() {
        pizza.setMeat("With olives");
        return this;
    }

    @Override
    public PizzaBuilder addMushrooms() {
        pizza.setMeat("More champignons");
        return this;
    }
}
