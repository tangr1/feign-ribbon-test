package com.github.tangr1.feigntest.config;

import com.github.tangr1.feigntest.client.BuyServiceClient;
import com.github.tangr1.feigntest.interceptor.LogInterceptor;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableFeignClients(basePackageClasses = BuyServiceClient.class)
public class SpringConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logInterceptor());
    }

    @Bean
    public LogInterceptor logInterceptor() {
        return new LogInterceptor();
    }
}
