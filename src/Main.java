import DecoratorDesignPattern.Burger;
import DecoratorDesignPattern.CheeseBurger;
import DecoratorDesignPattern.ExtraCheeseBurger;
import DecoratorDesignPattern.ExtraVegBurger;

public class Main {
    public static void main(String[] args) {
         Burger burger = new CheeseBurger();
         System.out.println(burger.getDescription()+" - "+burger.price());
         burger = new ExtraCheeseBurger(burger);
         System.out.println(burger.getDescription()+" - "+burger.price());
         burger = new ExtraVegBurger(burger);
         System.out.println(burger.getDescription()+" - "+burger.price());
    }
}