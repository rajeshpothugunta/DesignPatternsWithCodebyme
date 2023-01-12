package strategydesignpattern;

import strategydesignpattern.strategies.WithoutRunway;

public class Helicopter extends FlyingMachine{
    public Helicopter() {
        super(new WithoutRunway());
    }
}
