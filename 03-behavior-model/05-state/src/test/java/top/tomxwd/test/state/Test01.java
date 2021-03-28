package top.tomxwd.test.state;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author xwd
 */
@Slf4j
public class Test01 {

    @Test
    public void test1() {
        Context context = new Context("phone");

        // 获取当前状态
        log.info("当前商品状态为：{}", context.getState());

        // 补库存
        RevertState revertState = new RevertState();
        revertState.doAction(context);

        // 获取当前状态
        log.info("当前商品状态为：{}", context.getState());

        // 减库存
        DeductState deductState = new DeductState();
        deductState.doAction(context);

        // 获取当前状态
        log.info("当前商品状态为：{}", context.getState());

    }

}
