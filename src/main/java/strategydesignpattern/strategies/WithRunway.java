package strategydesignpattern.strategies;

public class WithRunway implements FlyStrategy {
    @Override
    public void wayOfFly() {
        System.out.println("Flying with Runway");
    }
}
