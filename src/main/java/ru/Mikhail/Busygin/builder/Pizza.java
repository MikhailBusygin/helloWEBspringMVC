package ru.Mikhail.Busygin.builder;

public class Pizza {

    private String meat;
    private String cucumbers;
    private String olives;
    private String mushrooms;

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setCucumbers(String cucumbers) {
        this.cucumbers = cucumbers;
    }

    public void setOlives(String olives) {
        this.olives = olives;
    }

    public void setMushrooms(String mushrooms) {
        this.mushrooms = mushrooms;
    }

    @Override
    public String toString() {
        return "salad: " + meat +
                ", soup: " + cucumbers +
                ", main dish: " + olives +
                ", beverage: " + mushrooms;
    }
}
