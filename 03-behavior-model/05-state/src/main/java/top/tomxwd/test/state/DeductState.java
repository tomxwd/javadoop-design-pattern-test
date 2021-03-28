package top.tomxwd.test.state;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xwd
 */
@Slf4j
public class DeductState implements State {
    @Override
    public void doAction(Context context) {
        log.info("商品卖出，准备减少库存");
        context.setState(this);
        // 执行具体的减库存操作
    }
}
