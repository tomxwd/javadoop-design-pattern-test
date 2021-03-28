package top.tomxwd.test.decorate;

/**
 * @author xwd
 */
public class Lemon extends Condiment {

    private Beverage beverage;

    /**
     * 这里十分关键，传入需要加料（包装）的饮料
     *
     * @param beverage
     */
    public Lemon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ",加柠檬";
    }

    @Override
    public double cost() {
        // 加柠檬要加两块
        return beverage.cost() + 2;
    }
}
