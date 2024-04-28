package MediatorDesignPattern;

public interface Colleague {
    public void placeBid(int bitAmount);
    public void receiveNotification(int bidAmount);

    public String getName();
}
