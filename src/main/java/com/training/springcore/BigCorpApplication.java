package com.training.springcore;

import com.training.springcore.service.SiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BigCorpApplication {

    public static final ApplicationContext CONTEXT = new AnnotationConfigApplicationContext(BigCorpApplicationConfig.class);

    public static void main (String[] args){
        BigCorpApplication application = new BigCorpApplication();
        application.run();
    }

    public void run(){

        System.out.println("Application startup");
        SiteService siteService = (SiteService) CONTEXT.getBean("siteService");
        System.out.println(siteService.findById("siteA"));
        siteService = (SiteService) CONTEXT.getBean("siteService");
        System.out.println(siteService.findById("siteA"));
    }
}
