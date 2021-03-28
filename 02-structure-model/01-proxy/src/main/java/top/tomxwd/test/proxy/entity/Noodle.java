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
public class Noodle extends Food {
    private String noodle;
}
