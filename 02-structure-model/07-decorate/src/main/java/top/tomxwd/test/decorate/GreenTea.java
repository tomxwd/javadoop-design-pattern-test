package top.tomxwd.test.decorate;

/**
 * 绿茶
 *
 * @author xwd
 */
public class GreenTea extends Beverage {
    @Override
    public String getDesc() {
        return "绿茶";
    }

    @Override
    public double cost() {
        return 11;
    }
}
