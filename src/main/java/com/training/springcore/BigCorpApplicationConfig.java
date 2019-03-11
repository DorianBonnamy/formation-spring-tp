package com.training.springcore;

import com.training.springcore.model.ApplicationInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.util.Set;

@ComponentScan
@Configuration
@PropertySource("classpath:application.properties")
public class BigCorpApplicationConfig {

    @Bean
    public ApplicationInfo applicationInfo(){
        return new ApplicationInfo();
    }

}
