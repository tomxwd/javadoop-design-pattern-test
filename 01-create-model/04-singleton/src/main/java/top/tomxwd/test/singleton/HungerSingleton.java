package top.tomxwd.test.singleton;

import java.util.Date;

/**
 * 饿汉模式
 * 饿汉模式的缺点很明显，就是如果调用这个类的其他资源而不用到这个单例实例，是资源的浪费
 * 但是，一般不会不用这个实例，而去调用他的静态方法，或者其他的静态方法并没有必要放到这个类里来
 *
 * @author xwd
 */
public class HungerSingleton {

    /**
     * 构造器私有化，一定要私有化 把new的路堵死
     */
    private HungerSingleton() {
    }

    /**
     * 私有静态实例，这个类一旦被使用就会进行创建
     */
    private static final HungerSingleton INSTANCE = new HungerSingleton();

    /**
     * 外界只能通过这个方法来获取实例，其他路径封死，这里不考虑反射等
     *
     * @return
     */
    public static HungerSingleton getInstance() {
        return INSTANCE;
    }

    /**
     * 这里作者想说
     * 如果我们这个HSingleton只想做一些其他操作 如调用静态方法 完全没用到这个类的单例实例，那是会浪费资源的
     *
     * @return
     */
    public static Date getDate() {
        return new Date();
    }

}
