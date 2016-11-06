package FactoryMethod;

import java.util.Locale;

/**
 * Created by yamhadjo on 25/10/2016.
 */
public class ConcreteCreator extends Creator {

    public void factoryMethod(String local){
        if(local=="FR"){

            ConcreteProductFR prodFR = new ConcreteProductFR();

        }if(local=="DE"){
            ConcreteProductDE prodFR = new ConcreteProductDE();

        }if(local=="EN"){
            ConcreteProductEN prodFR = new ConcreteProductEN();

        }
    }

    public Product createProduct()
    {
        Locale locale = Locale.getDefault();
        String local = locale.getCountry();

        switch (locale.getCountry()){
            case "FR":
                return new ConcreteProductFR();
            case "DE":
                return new ConcreteProductDE();
            case "EN":
                return new ConcreteProductEN();
            default:
                return new ConcreteProductFR();

        }

    }

    public void anOperation(){

    }
}
