package TemplateDesignPattern;

public class TemplateDriver {
    public static void main(String[] args){
        UPI upi = new Paytm();
        upi.execute();
    }
}
