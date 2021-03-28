package top.tomxwd.test.adapter.object2;

/**
 * 给鸡用的适配器 毫无疑问需要实现Duck接口，不然怎么假装成鸭
 *
 * @author xwd
 */
public class CockAdapter implements Duck {

    private Cock cock;

    public CockAdapter(Cock cock) {
        this.cock = cock;
    }

    @Override
    public void quack() {
        cock.gobble();
    }

    @Override
    public void fly() {
        cock.fly();
    }
}
