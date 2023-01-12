package strategydesignpattern;

import strategydesignpattern.strategies.FlyStrategy;

public abstract class FlyingMachine {
    FlyStrategy obj;

    public FlyingMachine(FlyStrategy obj) {
        this.obj = obj;
    }
    private void fly(){
        obj.wayOfFly();
    }
}
