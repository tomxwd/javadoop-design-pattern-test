package top.tomxwd.test.abstractfactory.factory.computer;

import top.tomxwd.test.abstractfactory.entity.cpu.CPU;
import top.tomxwd.test.abstractfactory.entity.mainboard.MainBoard;

/**
 * @author xwd
 */
public interface ComputerFactory {

    CPU makeCPU();
    MainBoard makeMainBoard();

}
