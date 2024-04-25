package TemplateDesignPattern;

public abstract class UPI {
    public abstract void preprocessing();
    public abstract void processing();
    public abstract void postprocessing();

    public final void execute(){
        preprocessing();
        processing();
        postprocessing();
    }
}
