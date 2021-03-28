package top.tomxwd.test.proxy.proxy;

import lombok.extern.slf4j.Slf4j;
import top.tomxwd.test.proxy.entity.Food;
import top.tomxwd.test.proxy.service.FoodService;
import top.tomxwd.test.proxy.service.impl.FoodServiceImpl;

/**
 * 代理 表现出来就是真实的一个实现类，所以需要实现FoodService接口
 *
 * @author xwd
 */
@Slf4j
public class FoodServiceProxy implements FoodService {

    /**
     * 代理 持有一个真实的实现类，也可以通过其他方法传入 这里直接new
     */
    private FoodService foodService = new FoodServiceImpl();

    @Override
    public Food makeChicken() {
        log.info("代理来代理做鸡肉");
        // 如果 下面的代码是核心代码，那就要让真正的实现类去完成的，代理只是在这前后做一些其他操作
        Food food = foodService.makeChicken();
        log.info("鸡肉已经制作完成{}，加点胡椒粉吧", food);
        // 增强一下
        food.setCondiment("pepper");
        return food;
    }

    @Override
    public Food makeNoodle() {
        log.info("开始制作拉面");
        Food food = foodService.makeNoodle();
        log.info("拉面制作完成{}", food);
        return food;
    }
}
