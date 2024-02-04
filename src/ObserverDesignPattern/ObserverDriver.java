package ObserverDesignPattern;

public class ObserverDriver {
    public static void main(String[] args) {

        // Observer design pattern
        Channel channel = new ArunPanwar();
        Subscriber subscriber = new TanmayTiwari(channel);
        channel.publishVideo("My new house and car");
        System.out.println(subscriber.getVideo());
        channel.publishVideo("New Trip to laddakh");
        System.out.println(subscriber.getVideo());
    }
}
