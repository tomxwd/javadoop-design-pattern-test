package top.tomxwd.test.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.tomxwd.test.factory.entity.Food;
import top.tomxwd.test.factory.factory.ChineseFoodFactory;
import top.tomxwd.test.factory.factory.FoodFactory;

/**
 * @author xwd
 */
@Slf4j
public class Test01 {

    @Test
    public void test1() {
        FoodFactory factory = new ChineseFoodFactory();
        Food a = factory.makeFood("A");
        log.info("food的类型为：{}", a.getClass());
    }

}
