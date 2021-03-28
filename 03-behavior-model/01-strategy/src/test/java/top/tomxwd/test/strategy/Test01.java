package top.tomxwd.test.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author xwd
 */
@Slf4j
public class Test01 {

    @Test
    public void test1() {
        Context context = new Context(new BluePen());
        context.executeDraw(10, 0, 0);
    }

}
