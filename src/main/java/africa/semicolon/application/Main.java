package africa.semicolon.application;

import africa.semicolon.application.Services.HelloService;
import africa.semicolon.application.Services.MailService;
import africa.semicolon.application.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        System.out.println("beans in context:" + Arrays.toString(context.getBeanDefinitionNames()));

//        HelloService helloService = context.getBean(HelloService.class);
//        helloService.sayHello("Timi");

        MailService mailService = context.getBean(MailService.class);
        mailService.sendMailTo("timi@gmail.com");
    }
}