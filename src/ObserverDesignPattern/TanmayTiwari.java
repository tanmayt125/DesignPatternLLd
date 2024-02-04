package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class TanmayTiwari implements Subscriber{

    List<String> videos;

    Channel channel;

    TanmayTiwari(Channel channel){
        videos = new ArrayList<>();
        channel.addSubscriber(this);
    }
    @Override
    public List<String> getVideo() {
        return videos;
    }

    @Override
    public void addVideo(String video) {
     videos.add(video);
    }
}
