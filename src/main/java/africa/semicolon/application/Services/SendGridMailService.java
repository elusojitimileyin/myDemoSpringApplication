package africa.semicolon.application.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary

public class SendGridMailService implements MailService {

    private  HelloService helloService;

    @Autowired
    public SendGridMailService(HelloService helloService){
        System.out.println("SendGridMailService");
        this.helloService = helloService;
    }

    @Autowired
    public void setHelloService(HelloService helloService){
        System.out.println("called setHelloService");
        this.helloService = helloService;
    }

    @Override
    public void sendMailTo(String email){
        helloService.sayHello(email);
        System.out.println("Sending email to " + email);
    }

}
