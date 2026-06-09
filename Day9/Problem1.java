interface Notification {
    void sendNotification(String recipient);
}

class EmailNotification implements Notification {
    public void sendNotification(String recipient) {
        System.out.println("Email sent to " + recipient);
    }
}

class SMSNotification implements Notification {
    public void sendNotification(String recipient) {
        System.out.println("SMS sent to " + recipient);
    }
}

class PushNotification implements Notification {
    public void sendNotification(String recipient) {
        System.out.println("Push notification sent to " + recipient);
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Notification n;

        n = new EmailNotification();
        n.sendNotification("sandhiya@gmail.com");

        n = new SMSNotification();
        n.sendNotification("9876543210");

        n = new PushNotification();
        n.sendNotification("Mobile User");
    }
}