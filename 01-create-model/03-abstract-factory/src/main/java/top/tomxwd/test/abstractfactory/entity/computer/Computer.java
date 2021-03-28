package top.tomxwd.test.abstractfactory.entity.computer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.tomxwd.test.abstractfactory.entity.cpu.CPU;
import top.tomxwd.test.abstractfactory.entity.mainboard.MainBoard;

/**
 * @author xwd
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer {

    private CPU cpu;
    private MainBoard mainBoard;

}
