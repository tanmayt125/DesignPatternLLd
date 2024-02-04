package ObserverDesignPattern;

import java.util.List;

public interface Subscriber {

    public List<String> getVideo();

    public void addVideo(String video);
}
