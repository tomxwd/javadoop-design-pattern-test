package top.tomxwd.test.adapter;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.tomxwd.test.adapter.object2.CockAdapter;
import top.tomxwd.test.adapter.object2.Duck;
import top.tomxwd.test.adapter.object2.WildCock;

/**
 * @author xwd
 */
@Slf4j
public class Test01 {

    @Test
    public void test1(){
        WildCock wildCock = new WildCock();
        Duck duck = new CockAdapter(wildCock);
        duck.quack();
        duck.fly();
    }


}
