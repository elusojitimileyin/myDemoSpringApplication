package africa.semicolon.application.Services;


import org.springframework.stereotype.Service;

@Service

public class MailGunMailService  implements MailService{

    @Override
    public void sendMailTo(String email) {
        System.out.println("Sending mail via MailGun" + email);
    }
}
