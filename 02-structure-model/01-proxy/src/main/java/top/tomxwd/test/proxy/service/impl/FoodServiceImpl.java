package top.tomxwd.test.proxy.service.impl;

import top.tomxwd.test.proxy.entity.Chicken;
import top.tomxwd.test.proxy.entity.Food;
import top.tomxwd.test.proxy.entity.Noodle;
import top.tomxwd.test.proxy.service.FoodService;

/**
 * @author xwd
 */
public class FoodServiceImpl implements FoodService {
    @Override
    public Food makeChicken() {
        Chicken food = new Chicken();
        food.setChicken("1kg");
        food.setSpicy("1g");
        food.setSalt("3g");
        return food;
    }

    @Override
    public Food makeNoodle() {
        Noodle food = new Noodle();
        food.setNoodle("500g");
        food.setSalt("5g");
        return food;
    }

}
