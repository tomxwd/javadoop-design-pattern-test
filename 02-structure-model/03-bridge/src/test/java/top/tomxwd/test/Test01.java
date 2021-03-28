package top.tomxwd.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.tomxwd.test.bridge.*;

/**
 * @author xwd
 */
@Slf4j
public class Test01 {

    @Test
    public void test1() {
        Shape greenCircle = new Circle(10, new GreenPen());
        Shape redRectangle = new Rectangle(4, 8, new RedPen());
        greenCircle.draw();
        redRectangle.draw();
    }

}
