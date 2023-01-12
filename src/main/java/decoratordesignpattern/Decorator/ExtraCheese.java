package decoratordesignpattern.Decorator;

import decoratordesignpattern.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    public BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+20;
    }
}
