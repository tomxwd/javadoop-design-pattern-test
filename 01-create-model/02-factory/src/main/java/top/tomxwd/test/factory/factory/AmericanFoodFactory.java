package top.tomxwd.test.factory.factory;

import top.tomxwd.test.factory.entity.AmericanFoodA;
import top.tomxwd.test.factory.entity.AmericanFoodB;
import top.tomxwd.test.factory.entity.Food;

/**
 * @author xwd
 */
public class AmericanFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        if ("A".equals(name)) {
            return new AmericanFoodA();
        } else if ("B".equals(name)) {
            return new AmericanFoodB();
        } else {
            return null;
        }
    }
}
