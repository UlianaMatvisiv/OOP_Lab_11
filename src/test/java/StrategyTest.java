import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import ua.ucu.edu.tasktwo.Client;
import ua.ucu.edu.tasktwo.Gender;
import ua.ucu.edu.tasktwo.GiftMailCode;
import ua.ucu.edu.tasktwo.MailCode;
import ua.ucu.edu.tasktwo.MailInfo;
import ua.ucu.edu.tasktwo.BirthdayMailCode;

public class StrategyTest {

    private final Client client = new Client("Uliana", 18, Gender.FEMALE, "mymail");;

    @Test
    public void clientTest() {
        Client second = new Client("Max", 19, Gender.MALE, "hismail");
        Assertions.assertEquals(client.getName(), "Uliana");
        Assertions.assertEquals(client.getAge(), 18);
        Assertions.assertEquals(client.getSex(), Gender.FEMALE);
        Assertions.assertEquals(client.getMail(), "mymail");

        Assertions.assertEquals(second.getName(), "Max");
        Assertions.assertEquals(second.getAge(), 19);
        Assertions.assertEquals(second.getSex(), Gender.MALE);
        Assertions.assertEquals(second.getMail(), "hismail");
    }

    @Test
    public void giftTest() {
        GiftMailCode giftMail = new GiftMailCode();
        Assertions.assertInstanceOf(MailCode.class, giftMail);
        Assertions.assertEquals(giftMail.generateText(client),
                "Uliana, you've received a gift.");
    }

    @Test
    public void birthdayTest() {
        BirthdayMailCode giftMail = new BirthdayMailCode();
        Assertions.assertInstanceOf(MailCode.class, giftMail);
        Assertions.assertEquals(giftMail.generateText(client),
        "Happy Birthday, Uliana.");
    }

    @Test
    public void MailInfo() {
        GiftMailCode giftMail = new GiftMailCode();
        MailInfo mInfo = new MailInfo(client, giftMail);
        Assertions.assertEquals(giftMail.generateText(client), mInfo.generateText());
    }
}
