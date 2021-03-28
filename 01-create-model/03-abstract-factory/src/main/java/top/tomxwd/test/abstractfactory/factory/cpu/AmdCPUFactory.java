package top.tomxwd.test.abstractfactory.factory.cpu;

import top.tomxwd.test.abstractfactory.entity.cpu.AmdCPU;
import top.tomxwd.test.abstractfactory.entity.cpu.CPU;

/**
 * @author xwd
 */
public class AmdCPUFactory implements CPUFactory {
    @Override
    public CPU makeCPU() {
        return new AmdCPU();
    }
}
