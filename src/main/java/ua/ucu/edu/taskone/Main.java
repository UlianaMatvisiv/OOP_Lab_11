package ua.ucu.edu.taskone;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder()
                        .name("Oles")
                        .age(32)
                        .gender("m")
                        .mark(69)
                        .mark(100)
                        .build();
        System.out.println(user);
    }
}