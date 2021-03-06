package com.tang.springcloud001.auth.modular.service.impl;

import com.tang.springcloud001.auth.modular.entity.SysPermission;
import com.tang.springcloud001.auth.modular.mapper.SysPermissionMapper;
import com.tang.springcloud001.auth.modular.service.ISysPermissionService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源表 服务实现类
 * </p>
 *
 * @author fengshuonan
 * @since 2018-01-09
 */
@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements ISysPermissionService {
	
}
