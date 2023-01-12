package decoratordesignpattern.Decorator;

import decoratordesignpattern.BasePizza;

public class Mushrooms extends ToppingDecorator{
    public BasePizza basePizza;

    public Mushrooms(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+30;
    }
}
