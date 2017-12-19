package com.exzample.cloud.config;


import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.ZoneAvoidanceRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "miscrservice-provider-ribbo", configuration = RibbonConfiguration.class)
public class RibbonConfiguration {

    @Autowired
    IClientConfig config;


    @Bean
    @ConditionalOnMissingBean
    public IRule ribbonRule(IClientConfig config) {
        return new RandomRule();

    }

}
