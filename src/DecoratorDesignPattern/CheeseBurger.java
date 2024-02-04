package DecoratorDesignPattern;

public class CheeseBurger implements Burger {

    @Override
    public String getDescription() {
        return "Chesse Burger";
    }

    @Override
    public int price() {
        return 180;
    }
}
