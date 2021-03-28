package top.tomxwd.test.state;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xwd
 */
@Slf4j
public class RevertState implements State {
    @Override
    public void doAction(Context context) {
        log.info("给此商品补库存");
        context.setState(this);
        // 执行加库存的具体操作
    }
}
