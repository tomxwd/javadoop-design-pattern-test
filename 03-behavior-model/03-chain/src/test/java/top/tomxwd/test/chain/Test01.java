package top.tomxwd.test.chain;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author xwd
 */
@Slf4j
public class Test01 {

    NewUserRuleHandler newUserRuleHandler = new NewUserRuleHandler();
    LocationRuleHandler locationRuleHandler = new LocationRuleHandler();
    LimitRuleHandler limitRuleHandler = new LimitRuleHandler();

    {
        newUserRuleHandler.setSuccessor(locationRuleHandler);
        locationRuleHandler.setSuccessor(limitRuleHandler);
    }

    @Test
    public void test1() {
        // 老用户参加，抛异常
        Context context = new Context(false, "深圳", 10);
        newUserRuleHandler.apply(context);
    }

    @Test
    public void test2() {
        // 广州用户参加，抛异常
        Context context = new Context(true, "广州", 10);
        newUserRuleHandler.apply(context);
    }

    @Test
    public void test3() {
        // 没有库存，抛异常
        Context context = new Context(true, "深圳", 0);
        newUserRuleHandler.apply(context);
    }

    @Test
    public void test4() {
        // 完全符合的用户
        Context context = new Context(true, "深圳", 10);
        newUserRuleHandler.apply(context);
    }

}
