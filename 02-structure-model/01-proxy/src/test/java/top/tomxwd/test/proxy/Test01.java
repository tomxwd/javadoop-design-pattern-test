package top.tomxwd.test.proxy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.tomxwd.test.proxy.entity.Food;
import top.tomxwd.test.proxy.proxy.FoodServiceProxy;
import top.tomxwd.test.proxy.service.FoodService;

/**
 * @author xwd
 */
@Slf4j
public class Test01 {

    @Test
    public void test1() {
        FoodService foodService = new FoodServiceProxy();
        Food chicken = foodService.makeChicken();
        log.info("chicken最终为：{}", chicken);
        Food noodle = foodService.makeNoodle();
        log.info("noodle最终为：{}", noodle);
    }

}
