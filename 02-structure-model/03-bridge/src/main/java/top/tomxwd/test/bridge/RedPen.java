package top.tomxwd.test.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xwd
 */
@Slf4j
public class RedPen implements DrawApi {
    @Override
    public void draw(int radius, int x, int y) {
        log.info("用红色画笔画画，半径为：{}，x为：{}，y为：{}", radius, x, y);
    }
}
