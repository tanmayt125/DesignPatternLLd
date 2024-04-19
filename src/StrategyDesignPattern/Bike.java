package StrategyDesignPattern;

public class Bike {

    private Company company;

    public Bike(Company company){
        this.company = company;
    }
    public String company_details(){
        return company.company_details();
    }
}
