package top.tomxwd.test.decorate;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author xwd
 */
@Slf4j
public class Test01 {

    @Test
    public void test1() {
        Beverage beverage = new GreenTea();
        // 加柠檬
        beverage = new Lemon(beverage);
        // 加芒果
        beverage = new Mango(beverage);
        // 再加柠檬
        beverage = new Lemon(beverage);
        log.info("饮料：{}，价格为：{}", beverage.getDesc(), beverage.cost());
    }

}
