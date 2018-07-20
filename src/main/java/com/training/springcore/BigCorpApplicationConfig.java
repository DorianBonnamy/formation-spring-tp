package com.training.springcore;

import com.training.springcore.model.ApplicationInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Set;

@ComponentScan
@Configuration
@PropertySource("classpath:application.properties")
@PropertySource(value = "classpath:version.properties", ignoreResourceNotFound = true)
public class BigCorpApplicationConfig {

    @Value("${myapp.name}")
    private String name;

    @Value("${myapp.version}")
    private Integer version;

    @Value("${myapp.emails}")
    private Set<String> emails;

    @Value("${myapp.webSiteUrl}")
    private String webSiteUrl;

    @Bean
    public ApplicationInfo applicationInfo() {
        return new ApplicationInfo(name, version, emails, webSiteUrl);
    }

}