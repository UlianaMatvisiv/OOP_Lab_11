package ua.ucu.edu.tasktwo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class MailInfo {
    private Client client;
    private MailCode mailcode;
    
    public String generateText() {
        return mailcode.generateText(client);
    }
}
