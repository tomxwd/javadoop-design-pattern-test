package top.tomxwd.test.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xwd
 */
@Slf4j
public abstract class AbstractTemplate {

    /**
     * 这里就是模板方法！
     */
    public void templateMethod() {
        // 初始化
        init();
        // 重点
        apply();
        // 钩子
        end();
    }

    protected void init() {
        log.info("init 抽象层实现了，子类也可以选择覆写");
    }

    /**
     * 这里 留给子类去实现
     */
    protected abstract void apply();

    protected void end() {
        log.info("这里一般就是钩子了");
    }

}
