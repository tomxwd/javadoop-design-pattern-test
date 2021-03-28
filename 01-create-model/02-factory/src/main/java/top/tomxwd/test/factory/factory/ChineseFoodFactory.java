package top.tomxwd.test.factory.factory;

import top.tomxwd.test.factory.entity.ChineseFoodA;
import top.tomxwd.test.factory.entity.ChineseFoodB;
import top.tomxwd.test.factory.entity.Food;

/**
 * @author xwd
 */
public class ChineseFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if ("A".equals(name)) {
            return new ChineseFoodA();
        } else if ("B".equals(name)) {
            return new ChineseFoodB();
        } else {
            return null;
        }
    }
}
