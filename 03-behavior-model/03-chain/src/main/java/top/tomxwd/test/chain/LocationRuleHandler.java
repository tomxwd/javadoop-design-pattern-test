package top.tomxwd.test.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xwd
 */
@Slf4j
public class LocationRuleHandler extends RuleHandler {
    @Override
    public void apply(Context context) {
        if ("深圳".equals(context.getLocation())) {
            log.info("所在地区为深圳，放行");
            if (this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        } else {
            throw new RuntimeException("所在地区无法参加本次活动");
        }
    }
}
