package top.tomxwd.test.facade;

import org.junit.Test;

/**
 * @author xwd
 */
public class Test01 {

    @Test
    public void test1() {
        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();

    }

}
