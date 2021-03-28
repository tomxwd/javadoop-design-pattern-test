package top.tomxwd.test.simplefactory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.tomxwd.test.simplefactory.entity.Food;
import top.tomxwd.test.simplefactory.factory.FoodFactory;

/**
 * @author xwd
 */
@Slf4j
public class Test01 {

    @Test
    public void test() {
        Food food = FoodFactory.makeFood("noodle");
        log.info("food的类型为：{}", food.getClass());
        food = FoodFactory.makeFood("chicken");
        log.info("food的类型为：{}", food.getClass());
    }

}
