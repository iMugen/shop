package top.imugen.shop.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员收货地址表
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UmsMemberReceiveAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long memberId;

    /**
     * 收货人名称
     */
    private String name;

    private String phoneNumber;

    /**
     * 是否为默认
     */
    private Integer defaultStatus;

    /**
     * 邮政编码
     */
    private String postCode;

    /**
     * 省份/直辖市
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区
     */
    private String region;

    /**
     * 详细地址(街道)
     */
    private String detailAddress;


}
