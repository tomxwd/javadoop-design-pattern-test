package top.tomxwd.test.observer;

import org.junit.Test;

/**
 * @author xwd
 */
public class Test01 {

    @Test
    public void test1() {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexObserver(subject);

        // 数据变动
        subject.setState(11);
    }

}
