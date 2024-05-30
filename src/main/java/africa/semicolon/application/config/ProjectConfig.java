package africa.semicolon.application.config;

import africa.semicolon.application.Services.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages ="africa.semicolon.application")
public class ProjectConfig {

    @Bean
    @Primary
    public HelloService helloService1() {
        HelloService helloService = new HelloService();
        return  helloService;
    }

    @Bean
    public HelloService helloService2() {
        return new HelloService();
    }
}
