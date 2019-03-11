package com.training.springcore;

import com.training.springcore.service.SiteService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

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

        /*Test de lire un fichier*/
//            siteService.readFile("file:///C:/Users/Diginamic/Documents/Exercice_Swing/formation-spring-tp/data/lorem.txt"); /** chemin d'accès complet*/

//            siteService.readFile("/lorem.txt"); /** File dans resource*/
//            siteService.readFile("classpath:lorem.txt"); /** File dans resource*/
    }
}
