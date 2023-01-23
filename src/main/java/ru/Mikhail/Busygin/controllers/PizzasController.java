package ru.Mikhail.Busygin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.Mikhail.Busygin.builder.Pizza;
import ru.Mikhail.Busygin.builder.PizzaDirector;
import ru.Mikhail.Busygin.builder.partialBuilders.CheapPizzaBuilder;
import ru.Mikhail.Busygin.builder.partialBuilders.ExpensivePizzaBuilder;
import ru.Mikhail.Busygin.builder.partialBuilders.StandardPizzaBuilder;

@Controller
@RequestMapping("/pizzas")
public class PizzasController {

    @GetMapping("/cheap")
    public String cheap(Model model) {
        Pizza pizza = (new PizzaDirector()).getPizza(new CheapPizzaBuilder());
        model.addAttribute("pizza", pizza.toString());
        return "pizzas/pizza";
    }

    @GetMapping("/standard")
    public String standard(Model model) {
        Pizza pizza = (new PizzaDirector()).getPizza(new StandardPizzaBuilder());
        model.addAttribute("pizza", pizza.toString());
        return "pizzas/pizza";
    }

    @GetMapping("/expensive")
    public String expensive(Model model) {
        Pizza pizza = (new PizzaDirector()).getPizza(new ExpensivePizzaBuilder());
        model.addAttribute("pizza", pizza.toString());
        return "pizzas/pizza";
    }

    @GetMapping("/all")
    public String all() {
        return "pizzas/all";
    }
}
