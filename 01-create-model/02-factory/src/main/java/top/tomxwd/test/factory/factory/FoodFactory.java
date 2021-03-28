package top.tomxwd.test.factory.factory;

import top.tomxwd.test.factory.entity.Food;

/**
 * @author xwd
 */
public interface FoodFactory {

    Food makeFood(String name);

}
