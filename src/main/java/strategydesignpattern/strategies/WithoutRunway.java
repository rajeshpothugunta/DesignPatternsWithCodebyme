package strategydesignpattern.strategies;

public class WithoutRunway implements FlyStrategy {
    @Override
    public void wayOfFly() {
        System.out.println("Flying without Runway");
    }
}
