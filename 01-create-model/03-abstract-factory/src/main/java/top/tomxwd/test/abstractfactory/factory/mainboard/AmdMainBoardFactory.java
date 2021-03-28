package top.tomxwd.test.abstractfactory.factory.mainboard;

import top.tomxwd.test.abstractfactory.entity.mainboard.AmdMainBoard;
import top.tomxwd.test.abstractfactory.entity.mainboard.MainBoard;

/**
 * @author xwd
 */
public class AmdMainBoardFactory implements MainBoardFactory {
    @Override
    public MainBoard makeBoard() {
        return new AmdMainBoard();
    }
}
