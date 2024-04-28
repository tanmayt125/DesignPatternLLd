package MediatorDesignPattern;

public class Bidders implements Colleague{

    private String name;
    private Mediator mediator;

    public  Bidders(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
        mediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        mediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveNotification(int bidAmount) {
       System.out.println("Hi " + name + " Someone has placed a bid of amount "+bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
