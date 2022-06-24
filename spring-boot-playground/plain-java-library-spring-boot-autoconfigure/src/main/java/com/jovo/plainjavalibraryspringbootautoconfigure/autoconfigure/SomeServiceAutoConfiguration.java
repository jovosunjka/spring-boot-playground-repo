package com.jovo.plainjavalibraryspringbootautoconfigure.autoconfigure;

import com.jovo.plainjavalibrary.services.SomeService;
import com.jovo.plainjavalibrary.services.configs.SomeServiceImpl1Config;
import com.jovo.plainjavalibrary.services.impl.SomeServiceImpl1;
import com.jovo.plainjavalibrary.services.impl.SomeServiceImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ConditionalOnClass(SomeService.class)
@EnableConfigurationProperties(SomeServiceProperties.class)
@ConditionalOnMissingBean(SomeService.class)
// When you want to define multiple beans for the same type (for example: SomeService)
// put @ConditionalOnMissingBean above class and specify type's class (for example: SomeService.class)
// for which beans are made, otherwise when you make beans for different types
// you can use @ConditionalOnMissingBean above each bean method
public class SomeServiceAutoConfiguration {
    @Autowired
    private SomeServiceProperties someServiceProperties;

    @Bean
    @ConditionalOnMissingBean
    public SomeServiceImpl1Config getSomeServiceImpl1Config() {
        int serviceParam1 = someServiceProperties.getServiceParam1() == 0 ?  1 : someServiceProperties.getServiceParam1();
        int serviceParam2 = someServiceProperties.getServiceParam2() == 0 ?  2 : someServiceProperties.getServiceParam1();
        int serviceParam3 = someServiceProperties.getServiceParam3() == 0 ?  3 : someServiceProperties.getServiceParam3();
        return new SomeServiceImpl1Config(serviceParam1, serviceParam2, serviceParam3);
    }

    @Primary
    @Bean(name = "SomeServiceImpl1")
    public SomeService getSomeServiceImpl1(SomeServiceImpl1Config someServiceImpl1Config) {
        return new SomeServiceImpl1(someServiceImpl1Config);
    }

    @Bean(name = "SomeServiceImpl2")
    public SomeService getSomeServiceImpl2() {
        return new SomeServiceImpl2();
    }
}
