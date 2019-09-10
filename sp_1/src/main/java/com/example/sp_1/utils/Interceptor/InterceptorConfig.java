package com.example.sp_1.utils.Interceptor;

import com.example.sp_1.utils.Interceptor.LogCostInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new LogCostInterceptor()).addPathPatterns("/**").excludePathPatterns("/static/**","/login/**","/login");

        super.addInterceptors(registry);
    }
}
