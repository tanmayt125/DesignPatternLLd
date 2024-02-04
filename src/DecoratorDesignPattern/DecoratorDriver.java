package DecoratorDesignPattern;

public class DecoratorDriver {
    public static void main(String[] args) {
        // decorator design pattern
        Burger burger = new CheeseBurger();
        System.out.println(burger.getDescription()+" - "+burger.price());
        burger = new ExtraCheeseBurger(burger);
        System.out.println(burger.getDescription()+" - "+burger.price());
        burger = new ExtraVegBurger(burger);
        System.out.println(burger.getDescription()+" - "+burger.price());
    }
}
