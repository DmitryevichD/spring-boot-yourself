package com.ironbank;

import com.ironbank.annotation.ConditionalOnProduction;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class IronConfiguration {
    @Bean
    @ConditionalOnProduction
    @ConditionalOnProperty("raven.where")
    public RavenListener ravenListener(RavenProperties r) {
        return new RavenListener(r);
    }

}
