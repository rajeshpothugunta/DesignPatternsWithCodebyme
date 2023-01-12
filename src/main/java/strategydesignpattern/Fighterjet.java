package strategydesignpattern;

import strategydesignpattern.strategies.FlyStrategy;
import strategydesignpattern.strategies.WithRunway;

public class Fighterjet extends FlyingMachine{
    public Fighterjet() {
        super(new WithRunway());
    }
}
