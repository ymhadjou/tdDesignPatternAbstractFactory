package FactoryMethod.client;

import FactoryMethod.ConcreteCreator;
import FactoryMethod.Creator;
import FactoryMethod.Product;

/**
 * Created by yamhadjo on 25/10/2016.
 */
public class Client {

    Creator creator = new ConcreteCreator();
    Product p1 = creator.createProduct();
    Product p2 = creator.createProduct();



}
