package top.tomxwd.test.abstractfactory.factory.cpu;

import top.tomxwd.test.abstractfactory.entity.cpu.CPU;
import top.tomxwd.test.abstractfactory.entity.cpu.IntelCPU;

/**
 * @author xwd
 */
public class IntelCPUFactory implements CPUFactory {
    @Override
    public CPU makeCPU() {
        return new IntelCPU();
    }
}
