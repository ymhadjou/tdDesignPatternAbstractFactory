package FactoryMethod;

/**
 * Created by yamhadjo on 25/10/2016.
 */
public abstract class Creator {

    abstract void factoryMethod(String local);
    abstract void anOperation();
    public abstract Product createProduct();
}
