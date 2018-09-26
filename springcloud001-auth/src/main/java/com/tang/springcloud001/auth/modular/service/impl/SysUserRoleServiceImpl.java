package com.tang.springcloud001.auth.modular.service.impl;

import com.tang.springcloud001.auth.modular.entity.SysUserRole;
import com.tang.springcloud001.auth.modular.mapper.SysUserRoleMapper;
import com.tang.springcloud001.auth.modular.service.ISysUserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户-角色关联表 服务实现类
 * </p>
 *
 * @author fengshuonan
 * @since 2018-01-09
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements ISysUserRoleService {
	
}
