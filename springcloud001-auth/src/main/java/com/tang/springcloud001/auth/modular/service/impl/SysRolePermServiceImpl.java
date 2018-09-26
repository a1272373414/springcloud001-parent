package com.tang.springcloud001.auth.modular.service.impl;

import com.tang.springcloud001.auth.modular.entity.SysRolePerm;
import com.tang.springcloud001.auth.modular.mapper.SysRolePermMapper;
import com.tang.springcloud001.auth.modular.service.ISysRolePermService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限-资源中间表 服务实现类
 * </p>
 *
 * @author fengshuonan
 * @since 2018-01-09
 */
@Service
public class SysRolePermServiceImpl extends ServiceImpl<SysRolePermMapper, SysRolePerm> implements ISysRolePermService {
	
}
