package top.tomxwd.test.abstractfactory.factory.mainboard;

import top.tomxwd.test.abstractfactory.entity.mainboard.IntelMainBoard;
import top.tomxwd.test.abstractfactory.entity.mainboard.MainBoard;

/**
 * @author xwd
 */
public class IntelMainBoardFactory  implements MainBoardFactory {
    @Override
    public MainBoard makeBoard() {
        return new IntelMainBoard();
    }
}
