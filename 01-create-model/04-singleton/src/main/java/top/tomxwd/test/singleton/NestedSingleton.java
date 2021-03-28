package top.tomxwd.test.singleton;

/**
 * 嵌套单例模式
 * 网上很多人会说是静态内部类，严格来说不对，访问的外部类权限不一样
 * <p>
 * 最后提一句嘴枚举，类加载的时候会初始化里面所有的实例，JVM保证了他们不会再被实例化，所以天生单例
 * 很少用枚举来实现单例，在RxJava的源码中，很多地方用枚举来实现单例
 *
 * @author xwd
 */
public class NestedSingleton {

    /**
     * 构造器私有化不多说
     */
    private NestedSingleton() {
    }

    private static class Holder {
        private static NestedSingleton instance = new NestedSingleton();
    }

    public static NestedSingleton getInstance() {
        return Holder.instance;
    }

}
