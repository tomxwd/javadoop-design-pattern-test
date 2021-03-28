package top.tomxwd.test.decorate;

/**
 * 红茶
 *
 * @author xwd
 */
public class BlackTea extends Beverage {
    @Override
    public String getDesc() {
        return "红茶";
    }

    @Override
    public double cost() {
        return 10;
    }
}
