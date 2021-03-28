package top.tomxwd.test.singleton;

/**
 * 饱汉模式
 * 一定要注意 volatile关键字 以及 双重检查
 * 另一种是直接在getInstance方法上加synchronized，这样性能很差哈
 *
 * @author xwd
 */
public class SaturationSingleton {

    /**
     * 构造器私有化，单例必备
     */
    private SaturationSingleton() {
    }

    /**
     * 先不初始化，注意家volatile，线程可见性
     */
    private static volatile SaturationSingleton instance = null;

    public static SaturationSingleton getInstance() {
        if (instance == null) {
            // 加锁 锁class
            synchronized (SaturationSingleton.class) {
                // 这里是必须要判断的，避免并发情况
                if (instance == null) {
                    instance = new SaturationSingleton();
                }
            }
        }
        return instance;
    }

}
