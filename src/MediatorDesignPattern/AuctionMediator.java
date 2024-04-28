package MediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator{

    private List<Colleague> bidders;

    public AuctionMediator(){
        bidders = new ArrayList<>();
    }
    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for(Colleague bidHolders:bidders){
            if(!bidHolders.getName().equals(bidder.getName())){
                bidHolders.receiveNotification(bidAmount);
            }
        }
    }

    @Override
    public void addBidder(Colleague bidder) {
         bidders.add(bidder);
    }
}
