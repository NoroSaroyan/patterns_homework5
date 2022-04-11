import Subscriber.FirstSubscriber;
import Subscriber.SecondSubscriber;
import Subscriber.SocialNetworkChannel;
import Subscriber.ThirdSubscriber;

public class App {

    public static void main(String[] args) {

        SocialNetworkChannel channel = new SocialNetworkChannel();

        new FirstSubscriber(channel);
        new SecondSubscriber(channel);
        new ThirdSubscriber(channel);

        System.out.println("----------------------------------------");
        String text = "first meesage";
        channel.setMessage(text);
        System.out.println("----------------------------------------");
        text = "second message";
        channel.setMessage(text);
    }
}