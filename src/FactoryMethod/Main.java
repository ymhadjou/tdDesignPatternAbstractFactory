package FactoryMethod;

/**
 * Created by yamhadjo on 25/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        // write your code here

        Creator creator = new ConcreteCreator();
        Product p1 = creator.createProduct();
        Product p2 = creator.createProduct();

        System.out.println(p1);

        //exemple test
        //Locale locale = Locale.english
        //syso(locale)
        //Product product = creator.createProduct();
        //Assert(locale.getCountry(), product.getName)
    }
}
