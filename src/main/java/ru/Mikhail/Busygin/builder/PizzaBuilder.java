package ru.Mikhail.Busygin.builder;

public interface PizzaBuilder {
    Pizza reset();

    PizzaBuilder addMeat();

    PizzaBuilder addCucumbers();

    PizzaBuilder addOlives();

    PizzaBuilder addMushrooms();
}
