package com.tang.springcloud001.core.context;

import com.tang.springcloud001.api.auth.AuthServiceApi;
import com.tang.springcloud001.core.constant.Constant;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 用户中心服务
 *
 * @author fengshuonan
 * @date 2017-11-09-下午7:52
 */
@FeignClient(Constant.AUTH_MODULAR_NAME)
public interface AuthServiceConsumer extends AuthServiceApi {

}
