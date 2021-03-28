package top.tomxwd.test.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xwd
 */
@Slf4j
public class LimitRuleHandler extends RuleHandler {
    @Override
    public void apply(Context context) {
        if (context.getCount() > 0) {
            log.info("还有奖品 放行");
            if (this.successor != null) {
                this.getSuccessor().apply(context);
            }
        } else {
            throw new RuntimeException("已经没有奖品了");
        }
    }
}
