package ru.Mikhail.Busygin.builder;

public class PizzaDirector {
    public Pizza getPizza(PizzaBuilder pizzaBuilder) {
        Pizza pizza = pizzaBuilder.reset();
        pizzaBuilder.addMeat().addCucumbers().addOlives().addMushrooms();
        return pizza;
    }
}
