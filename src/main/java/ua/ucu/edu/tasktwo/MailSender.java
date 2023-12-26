package ua.ucu.edu.tasktwo;


import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {
    public static final String APIKEY =
            System.getenv("MAILJET_API_KEY");
    public static final String APISECRET =
            System.getenv("MAILJET_SECRET_KEY");

    public void sendMail(MailInfo mailInfo) throws MailjetException, MailjetSocketTimeoutException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;

        client = new MailjetClient(APIKEY, APISECRET,
                new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "abc34tgj@ucu.edu.ua")
                                        .put("Name", "Uliana"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", mailInfo.getClient()
                                                    .getMail())
                                                .put("Name", mailInfo.getClient()
                                                    .getName())))
                                .put(Emailv31.Message.SUBJECT,
                                        "Hi!")
                                .put(Emailv31.Message.TEXTPART,
                                        "Some text")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}