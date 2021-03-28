package top.tomxwd.test.chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xwd
 */
@Slf4j
public class NewUserRuleHandler extends RuleHandler {

    @Override
    public void apply(Context context) {
        if (context.isNewUser()) {
            // 如果是新用户
            log.info("是新用户，放行");
            if (this.getSuccessor() != null) {
                this.successor.apply(context);
            }
        } else {
            throw new RuntimeException("该活动仅限新用户参与");
        }
    }

}
