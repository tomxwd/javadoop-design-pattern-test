package top.tomxwd.test.abstractfactory.factory.computer;

import top.tomxwd.test.abstractfactory.entity.cpu.CPU;
import top.tomxwd.test.abstractfactory.entity.cpu.IntelCPU;
import top.tomxwd.test.abstractfactory.entity.mainboard.IntelMainBoard;
import top.tomxwd.test.abstractfactory.entity.mainboard.MainBoard;

/**
 * @author xwd
 */
public class IntelFactory implements ComputerFactory{
    @Override
    public CPU makeCPU() {
        return new IntelCPU();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new IntelMainBoard();
    }


}
