package top.tomxwd.test.abstractfactory.factory.computer;

import top.tomxwd.test.abstractfactory.entity.cpu.AmdCPU;
import top.tomxwd.test.abstractfactory.entity.cpu.CPU;
import top.tomxwd.test.abstractfactory.entity.mainboard.AmdMainBoard;
import top.tomxwd.test.abstractfactory.entity.mainboard.MainBoard;

/**
 * @author xwd
 */
public class AmdFactory implements ComputerFactory {

    @Override
    public CPU makeCPU() {
        return new AmdCPU();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new AmdMainBoard();
    }
}
