package com.ironbank;

import com.ironbank.annotation.ConditionalOnProduction;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class IronConfiguration {
    @Bean
    @ConditionalOnProduction
    public RavenListener ravenListener() {
        return new RavenListener();
    }

}
