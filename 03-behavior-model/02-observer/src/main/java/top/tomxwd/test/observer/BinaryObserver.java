package top.tomxwd.test.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xwd
 */
@Slf4j
public class BinaryObserver extends Observer {

    /**
     * 构造方法里 订阅主题
     *
     * @param subject 主题
     */
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * 主题数据变更的时候调用
     */
    @Override
    public void update() {
        String result = Integer.toBinaryString(subject.getState());
        log.info("订阅的数据发生变化，新的数据处理为二进制为：{}", result);
    }

}
