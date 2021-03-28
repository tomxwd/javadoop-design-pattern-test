package top.tomxwd.test.prototype;

/**
 * 原型模式：有一个原型实例，基于这个原型实例产生新的实例 => 克隆
 *
 * @author xwd
 */
public class Prototype implements Cloneable{

    /**
     * 这就是 原型模式
     * java默认是浅克隆，碰到对象的引用，克隆出来的对象和原对象指向同一个对象
     * 深克隆的话一般是序列化了
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 需要实现Cloneable接口，否则抛CloneNotSupportedException
        return super.clone();
    }
}
