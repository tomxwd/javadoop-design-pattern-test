package top.tomxwd.test.decorate;

/**
 * @author xwd
 */
public class Mango extends Condiment {

    private Beverage beverage;

    public Mango(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ",加芒果";
    }

    @Override
    public double cost() {
        return beverage.cost() + 3;
    }
}
