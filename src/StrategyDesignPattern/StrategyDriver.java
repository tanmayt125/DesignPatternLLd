package StrategyDesignPattern;

public class StrategyDriver {
    public static void main(String[] args){
        Bike bike = new Splendor();
        System.out.println(bike.company_details());
        bike = new Glamour();
        System.out.println(bike.company_details());
    }
}
