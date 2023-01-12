package decoratordesignpattern;

import decoratordesignpattern.Decorator.Mushrooms;

public class Main {
    public static void main(String[] args) {
        BasePizza farmhouse = new Mushrooms(new FarmHouse());
        System.out.println(farmhouse.cost());
    }
}
