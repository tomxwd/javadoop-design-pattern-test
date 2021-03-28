package top.tomxwd.test.bridge;

/**
 * 这里 就是所谓的桥梁
 * 被Shape使用，而具体的DrawApi是被XxxPen实现的
 * 而Shape中调用draw来做事情
 *
 * @author xwd
 */
public interface DrawApi {

    void draw(int radius, int x, int y);

}
