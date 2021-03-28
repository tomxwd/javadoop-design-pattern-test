package top.tomxwd.test.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xwd
 */
@Slf4j
public class BluePen implements Strategy {
    @Override
    public void draw(int radius, int x, int y) {
        log.info("用蓝色笔画图，radius：{}，x：{}，y：{}", radius, x, y);
    }
}
