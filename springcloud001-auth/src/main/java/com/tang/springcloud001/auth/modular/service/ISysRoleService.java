package com.tang.springcloud001.auth.modular.service;

import com.baomidou.mybatisplus.service.IService;
import com.tang.springcloud001.auth.modular.entity.SysPermission;
import com.tang.springcloud001.auth.modular.entity.SysRole;

import java.util.List;

/**
 * <p>
 * 用户权限吧 服务类
 * </p>
 *
 * @author fengshuonan
 * @since 2018-01-09
 */
public interface ISysRoleService extends IService<SysRole> {

    /**
     * 获取用户的角色
     */
    List<Long> getUserRoleByUserId(Long userId);

    /**
     * 通过角色获取权限
     */
    List<SysPermission> getSysPermisionsByRole(Long roleId);

}
