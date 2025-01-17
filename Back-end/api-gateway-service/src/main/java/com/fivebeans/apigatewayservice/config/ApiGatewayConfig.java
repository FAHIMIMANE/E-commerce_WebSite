package com.fivebeans.apigatewayservice.config;

import brave.sampler.Sampler;
import com.fivebeans.apigatewayservice.filters.PostFilter;
import com.fivebeans.apigatewayservice.filters.PreFilter;
import com.fivebeans.apigatewayservice.filters.RouteFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApiGatewayConfig {

    @Bean
    public Sampler sampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }

}
