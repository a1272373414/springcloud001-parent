package com.tang.springcloud001.auth.modular.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tang.springcloud001.auth.modular.entity.SysPermission;
import com.tang.springcloud001.auth.modular.entity.SysRole;
import com.tang.springcloud001.auth.modular.entity.SysUserRole;
import com.tang.springcloud001.auth.modular.mapper.SysRoleMapper;
import com.tang.springcloud001.auth.modular.service.ISysRoleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 用户权限吧 服务实现类
 * </p>
 *
 * @author fengshuonan
 * @since 2018-01-09
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {

    @Override
    public List<Long> getUserRoleByUserId(Long userId) {
        ArrayList<Long> roles = new ArrayList<>();
        List<SysUserRole> sysUserRoles = new SysUserRole().selectList(new EntityWrapper().eq("user_id", userId));
        for (SysUserRole sysUserRole : sysUserRoles) {
            roles.add(sysUserRole.getRoleId());
        }
        return roles;
    }

    @Override
    public List<SysPermission> getSysPermisionsByRole(Long roleId) {
        return super.baseMapper.getPermissionsByRoleId(roleId);
    }
}
