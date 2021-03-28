package top.tomxwd.test.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xwd
 */
@Slf4j
public class ConcreteTemplate extends AbstractTemplate {
    @Override
    protected void apply() {
        log.info("子类实现了抽象方法apply()");
    }

    @Override
    protected void end() {
        log.info("这里钩子一下");
    }
}
