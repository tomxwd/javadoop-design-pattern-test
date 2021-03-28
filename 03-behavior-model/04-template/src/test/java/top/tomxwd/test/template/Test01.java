package top.tomxwd.test.template;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author xwd
 */
@Slf4j
public class Test01 {

    @Test
    public void test1() {
        AbstractTemplate template = new ConcreteTemplate();
        template.templateMethod();
    }

}
