package top.tomxwd.test.builder;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author xwd
 */
@Slf4j
public class Test01 {

    @Test
    public void test1() {
        User user = User.builder().build();
        log.info("用户信息为：{}", user);
    }

    @Test
    public void test2(){
        User user = User.builder().name("tomxwd").password("123456").age(19).build();
        log.info("用户信息为：{}", user);
    }

}
