package top.tomxwd.test.simplefactory.factory;

import top.tomxwd.test.simplefactory.entity.Food;
import top.tomxwd.test.simplefactory.entity.HuangMenChicken;
import top.tomxwd.test.simplefactory.entity.LanZhouNoodle;

/**
 * @author xwd
 */
public class FoodFactory {

    public static Food makeFood(String name) {
        Food food = null;
        if ("noodle".equals(name)) {
            food = new LanZhouNoodle();
            food.setSpicy("more");
        } else if ("chicken".equals(name)) {
            food = new HuangMenChicken();
            food.setCondiment("potato");
        }
        return food;
    }

}
