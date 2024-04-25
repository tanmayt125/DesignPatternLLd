package TemplateDesignPattern;

public class Paytm extends UPI{

    @Override
    public void preprocessing() {
        System.out.println("pre_processing executed");
    }

    @Override
    public void processing() {
        System.out.println("processing executed");
    }

    @Override
    public void postprocessing() {
        System.out.println("post processing executed");
    }
}
