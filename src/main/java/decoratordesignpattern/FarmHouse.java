package decoratordesignpattern;

public class FarmHouse extends BasePizza{
    @Override
    public int cost() {
        return 250;
    }
}
