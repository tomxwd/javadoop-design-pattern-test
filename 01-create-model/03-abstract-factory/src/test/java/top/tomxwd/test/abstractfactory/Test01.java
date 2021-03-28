package top.tomxwd.test.abstractfactory;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import top.tomxwd.test.abstractfactory.entity.cpu.CPU;
import top.tomxwd.test.abstractfactory.entity.computer.Computer;
import top.tomxwd.test.abstractfactory.entity.mainboard.MainBoard;
import top.tomxwd.test.abstractfactory.factory.mainboard.AmdMainBoardFactory;
import top.tomxwd.test.abstractfactory.factory.cpu.CPUFactory;
import top.tomxwd.test.abstractfactory.factory.cpu.IntelCPUFactory;
import top.tomxwd.test.abstractfactory.factory.mainboard.MainBoardFactory;

/**
 * 产品族工厂，不能保证兼容性
 *
 * @author xwd
 */
@Slf4j
public class Test01 {

    @Test
    public void test1() {
        CPUFactory cpuFactory = new IntelCPUFactory();
        CPU cpu = cpuFactory.makeCPU();

        MainBoardFactory mainBoardFactory = new AmdMainBoardFactory();
        MainBoard mainBoard = mainBoardFactory.makeBoard();

        Computer computer = new Computer(cpu, mainBoard);
        log.info("组装好的电脑信息：CPU为{} 主板为{}", computer.getCpu().getClass(), computer.getMainBoard().getClass());

    }

}
