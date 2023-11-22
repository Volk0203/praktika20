package org.example;
import java.util.ArrayList;
import java.util.List;

class User {
    private String name;
    private List<String> messages;
    public User(String name) {
        this.name = name;
        this.messages = new ArrayList<>();
    }
    public void sendMessage(String message) {
        messages.add(message);
    }
    public List<String> getMessages() {
        return messages;
    }
}
public class Main {
    public static void main(String[] args) {
        User user = new User("Oleg");
        user.sendMessage("Здравствуй");
        user.sendMessage("Как ты мой брат?");
        user.sendMessage("Где ты мой брат?");
        List<String> messages = user.getMessages();
        for (String message : messages) {
            System.out.println(message);
        }
    }
}
