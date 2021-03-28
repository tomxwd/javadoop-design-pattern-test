package top.tomxwd.test.adapter.object2;

import lombok.extern.slf4j.Slf4j;

/**
 * 野鸡
 *
 * @author xwd
 */
@Slf4j
public class WildCock implements Cock {

    @Override
    public void gobble() {
        log.info("咕咕咕");
    }

    @Override
    public void fly() {
        log.info("野鸡飞");
    }
}
