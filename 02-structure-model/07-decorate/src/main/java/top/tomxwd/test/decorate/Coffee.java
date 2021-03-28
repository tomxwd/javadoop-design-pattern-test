package top.tomxwd.test.decorate;

/**
 * 咖啡
 *
 * @author xwd
 */
public class Coffee extends Beverage {
    @Override
    public String getDesc() {
        return "咖啡";
    }

    @Override
    public double cost() {
        return 12;
    }
}
