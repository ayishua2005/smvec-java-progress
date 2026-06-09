interface MessageSender {
    void sendMessage(String message);
}

class WhatsAppSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("WhatsApp Message: " + message);
    }
}

class EmailSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Email Message: " + message);
    }
}

class TelegramSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("Telegram Message: " + message);
    }
}

public class Problem15 {
    public static void main(String[] args) {

        MessageSender sender;

        sender = new WhatsAppSender();
        sender.sendMessage("Hello from WhatsApp");

        sender = new EmailSender();
        sender.sendMessage("Hello from Email");

        sender = new TelegramSender();
        sender.sendMessage("Hello from Telegram");
    }
}