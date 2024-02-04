package ObserverDesignPattern;

public interface Channel {
    public void addSubscriber(Subscriber subscriber);
    public void notifySubscriber(String video);

    public Subscriber getSubcribers();

    public void publishVideo(String video);
}
