package DecoratorDesignPattern;

public class ExtraVegBurger implements Burger{

    public Burger burger;

    public ExtraVegBurger(Burger burger){
        this.burger = burger;
    }
    @Override
    public String getDescription() {
        return burger.getDescription() + " with extra added veggies";
    }

    @Override
    public int price() {
        return burger.price()+100;
    }
}
