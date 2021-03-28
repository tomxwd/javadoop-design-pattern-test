package top.tomxwd.test.abstractfactory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.tomxwd.test.abstractfactory.entity.computer.Computer;
import top.tomxwd.test.abstractfactory.entity.cpu.CPU;
import top.tomxwd.test.abstractfactory.entity.mainboard.MainBoard;
import top.tomxwd.test.abstractfactory.factory.computer.AmdFactory;
import top.tomxwd.test.abstractfactory.factory.computer.ComputerFactory;

/**
 * 产品族 抽象工厂
 * 如果要加一个硬件，比如硬盘，直接加硬盘类的工厂，然后再到computer工厂类加
 * 违背了 对修改关闭，对扩展开放的原则
 *
 * @author xwd
 */
@Slf4j
public class Test02 {

    @Test
    public void test1() {
        ComputerFactory computerFactory = new AmdFactory();
        CPU cpu = computerFactory.makeCPU();
        MainBoard mainBoard = computerFactory.makeMainBoard();
        Computer computer = new Computer(cpu, mainBoard);
        log.info("组装好的电脑信息：CPU为{} 主板为{}", computer.getCpu().getClass(), computer.getMainBoard().getClass());
    }

}
