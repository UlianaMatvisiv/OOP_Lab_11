package ua.ucu.edu.tasktwo;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Client {
    private static int clientCounter = 0;
    private int id;
    private String name;
    private int age;
    private Gender sex;
    private String mail;

    public Client(String somename, int someage, Gender somesex, String somemail) {
        id = clientCounter++;
        this.name = somename;
        this.age = someage;
        this.sex = somesex;
        this.mail = somemail;
    }
}
