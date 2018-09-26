package com.tang.springcloud001.scanner.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.tang.springcloud001.scanner.modular.factory.DefaultApiResourceFactory;
import com.tang.springcloud001.scanner.modular.service.ResourceCollectService;
import com.tang.springcloud001.scanner.config.properties.ScannerProperties;
import com.tang.springcloud001.scanner.modular.ApiResourceScaner;
import com.tang.springcloud001.scanner.modular.factory.ApiResourceFactory;
import com.tang.springcloud001.scanner.modular.listener.ResourceReportListener;

/**
 * 扫描器默认配置
 *
 * @author fengshuonan
 * @date 2018-02-06 17:25
 */
@Configuration
public class ScannerConfig {

    @Value("${spring.application.name}")
    private String applicationName;

    @Bean
    @ConfigurationProperties(prefix = "roses.scanner")
    public ScannerProperties scannerProperties() {
        return new ScannerProperties();
    }

    /**
     * 资源工厂
     */
    @Bean
    public ApiResourceFactory apiResourceFactory() {
        return new DefaultApiResourceFactory();
    }

    /**
     * 资源收集服务
     */
    @Bean
    public ResourceCollectService resourceCollectService(ApiResourceFactory apiResourceFactory, ScannerProperties scannerProperties) {
        return new ResourceCollectService(apiResourceFactory, scannerProperties);
    }

    /**
     * 资源扫描器
     */
    @Bean
    public ApiResourceScaner apiResourceScaner(ApiResourceFactory apiResourceFactory, ScannerProperties scannerProperties) {
        return new ApiResourceScaner(apiResourceFactory, scannerProperties, applicationName);
    }

    /**
     * 资源扫描之后的资源汇报操作（向roses-auth服务）
     */
    @Bean
    @ConditionalOnProperty(prefix = "roses.scanner", name = "open", havingValue = "true")
    public ResourceReportListener resourceReportListener() {
        return new ResourceReportListener();
    }
}
