package top.imugen.shop.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 成长值变化历史记录表
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UmsGrowthChangeHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long memberId;

    private LocalDateTime createTime;

    /**
     * 改变类型：0->增加；1->减少
     */
    private Integer changeType;

    /**
     * 积分改变数量
     */
    private Integer changeCount;

    /**
     * 操作人员
     */
    private String operateMan;

    /**
     * 操作备注
     */
    private String operateNote;

    /**
     * 积分来源：0->购物；1->管理员修改
     */
    private Integer sourceType;


}
