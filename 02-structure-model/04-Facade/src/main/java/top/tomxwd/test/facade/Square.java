package top.tomxwd.test.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xwd
 */
@Slf4j
public class Square implements Shape {
    @Override
    public void draw() {
        log.info("Square.draw");
    }
}
