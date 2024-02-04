package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ArunPanwar implements Channel{

    private List<Subscriber> subscriberList;

    public ArunPanwar(){
        subscriberList = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void notifySubscriber(String video) {
       for(Subscriber subscriber:subscriberList){
           subscriber.addVideo(video);
       }
    }

    @Override
    public Subscriber getSubcribers() {
        return null;
    }

    @Override
    public void publishVideo(String video) {
        notifySubscriber(video);
    }
}
