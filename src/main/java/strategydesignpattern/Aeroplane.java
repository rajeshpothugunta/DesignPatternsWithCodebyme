package strategydesignpattern;

import strategydesignpattern.strategies.WithRunway;

public class Aeroplane extends FlyingMachine{
    public Aeroplane() {
        super(new WithRunway());
    }
}
