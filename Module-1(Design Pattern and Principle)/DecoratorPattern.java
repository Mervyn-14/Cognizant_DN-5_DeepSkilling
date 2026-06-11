
interface Notifier {
    void send();
}

class EmailNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("Sending notification via Email");
    }
}

abstract class NotifierDecorator implements Notifier {

    protected Notifier notifier;
    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
    @Override
    public void send() {
        notifier.send();
    }
}


class SMSNotifierDecorator extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void send() {
        super.send();
        System.out.println("Sending notification via SMS");
    }
}

class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void send() {
        super.send();
        System.out.println("Sending notification via Slack");
    }
}

public class DecoratorPattern {

    public static void main(String[] args) {

        System.out.println("Email Notification:");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send();

        System.out.println("\nEmail + SMS Notification:");
        Notifier emailAndSmsNotifier =
                new SMSNotifierDecorator(
                        new EmailNotifier());

        emailAndSmsNotifier.send();

        System.out.println("\nEmail + SMS + Slack Notification:");
        Notifier multiChannelNotifier = new SlackNotifierDecorator( new SMSNotifierDecorator(new EmailNotifier()));

        multiChannelNotifier.send();
    }
}