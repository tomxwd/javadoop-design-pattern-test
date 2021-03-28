package top.tomxwd.test.proxy.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author xwd
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class Chicken extends Food {
    private String chicken;
    private String spicy;
}
