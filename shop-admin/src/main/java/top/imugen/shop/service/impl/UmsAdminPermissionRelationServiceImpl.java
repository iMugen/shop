package top.imugen.shop.service.impl;

import top.imugen.shop.entity.UmsAdminPermissionRelation;
import top.imugen.shop.mapper.UmsAdminPermissionRelationMapper;
import top.imugen.shop.service.IUmsAdminPermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限) 服务实现类
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Service
public class UmsAdminPermissionRelationServiceImpl extends ServiceImpl<UmsAdminPermissionRelationMapper, UmsAdminPermissionRelation> implements IUmsAdminPermissionRelationService {

}
