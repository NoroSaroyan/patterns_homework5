package Subscriber;

import java.util.ArrayList;
import java.util.List;

public class SocialNetworkChannel {

    private List<Subscriber> subscribers = new ArrayList<Subscriber>();
    private String message;

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println("new message: " + message);
        notifyAllSubscribers();
    }

    public void accede(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("signed: " + subscriber.getClass().getSimpleName());
    }

    public void notifyAllSubscribers() {
        for (Subscriber subscriber : subscribers) {
            System.out.println("message sent: " + subscriber.getClass().getSimpleName());
            subscriber.update();
        }
    }
}
