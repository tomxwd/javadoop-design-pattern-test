package top.tomxwd.test.state;

import lombok.Data;

/**
 * @author xwd
 */
@Data
public class Context {

    private String name;
    private State state;

    public Context(String name) {
        this.name = name;
    }
}
