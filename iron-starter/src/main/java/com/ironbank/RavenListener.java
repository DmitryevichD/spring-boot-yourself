package com.ironbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {
    private final RavenProperties ravenProperties;

    @Autowired
    public RavenListener(RavenProperties ravenProperties) {
        this.ravenProperties = ravenProperties;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ravenProperties.getWhere().forEach(s -> {
            System.out.println("Отправляем ворона в " + s);
        });
    }
}
