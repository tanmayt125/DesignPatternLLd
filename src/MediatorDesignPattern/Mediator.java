package MediatorDesignPattern;

public interface Mediator {
    public void placeBid(Colleague bidder,int bidAmount);

    public void addBidder(Colleague bidder);
}
