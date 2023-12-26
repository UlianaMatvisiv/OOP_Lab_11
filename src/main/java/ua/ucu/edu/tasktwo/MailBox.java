package ua.ucu.edu.tasktwo;

import java.util.ArrayList;
import java.util.List;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

public class MailBox {
    private List<MailInfo> infos;
    private final MailSender sender;

    MailBox(MailSender sender) {
        this.sender = sender;
        infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() throws MailjetException, 
            MailjetSocketTimeoutException {
        for (MailInfo mail : infos) {
            sender.sendMail(mail);
        }
        infos.clear();
    }
}
