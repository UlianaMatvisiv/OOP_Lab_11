package ua.ucu.edu.tasktwo;

public class BirthdayMailCode implements MailCode {
    @Override
    public String generateText(Client client) {
        return String.format("Happy Birthday, %s.", client.getName());
    }
}
