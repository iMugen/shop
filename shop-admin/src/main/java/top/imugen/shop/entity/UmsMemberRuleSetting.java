package top.imugen.shop.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员积分成长规则表
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UmsMemberRuleSetting implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 连续签到天数
     */
    private Integer continueSignDay;

    /**
     * 连续签到赠送数量
     */
    private Integer continueSignPoint;

    /**
     * 每消费多少元获取1个点
     */
    private BigDecimal consumePerPoint;

    /**
     * 最低获取点数的订单金额
     */
    private BigDecimal lowOrderAmount;

    /**
     * 每笔订单最高获取点数
     */
    private Integer maxPointPerOrder;

    /**
     * 类型：0->积分规则；1->成长值规则
     */
    private Integer type;


}
