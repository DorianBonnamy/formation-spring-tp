package com.training.springcore;

import com.training.springcore.service.SiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BigCorpApplication {

    public static void main (String[] args){
        BigCorpApplication application = new BigCorpApplication();
        application.run();
    }

    public void run(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BigCorpApplicationConfig.class);
        System.out.println("Application startup");
        SiteService siteService = (SiteService) context.getBean("siteService");
        System.out.println(siteService.findById("siteA"));
        siteService = (SiteService) context.getBean("siteService");
        System.out.println(siteService.findById("siteA"));
    }
}
