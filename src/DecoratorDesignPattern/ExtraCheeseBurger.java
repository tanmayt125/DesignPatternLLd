package DecoratorDesignPattern;

public class ExtraCheeseBurger implements Burger {

    public Burger burger;
    public ExtraCheeseBurger(Burger burger){
        this.burger = burger;
    }
    @Override
    public String getDescription() {
        return burger.getDescription()+ "with extra cheese";
    }

    @Override
    public int price() {
        return burger.price()+30;
    }
}
