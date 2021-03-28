package top.tomxwd.test.chain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xwd
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Context {

    /** 是否为新用户 */
    private boolean newUser;
    /** 用户所在地区 */
    private String location;
    /** 还剩余量 */
    private int count;

}
