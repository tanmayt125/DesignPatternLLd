package MediatorDesignPattern;

public class MediatorDriver {
    public static void main(String[] args){
        Mediator mediator = new AuctionMediator();
        Colleague bidder1 = new Bidders("Aman",mediator);
        Colleague bidder2 = new Bidders("Abhishek",mediator);
        Colleague bidder3 = new Bidders("Saket",mediator);
        bidder2.placeBid(1000000);
    }
}
