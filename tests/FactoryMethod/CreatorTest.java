package FactoryMethod;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Locale;

import static org.testng.Assert.*;

/**
 * Created by yamhadjo on 25/10/2016.
 */
public class CreatorTest {

        Creator creator;
    @BeforeMethod
    public void setUp() throws Exception {
     creator = new ConcreteCreator();
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testFactoryMethod() throws Exception {

    }

    @Test
    public void testAnOperation() throws Exception {

    }

    @Test
    public void testCreateProduct() throws Exception {
    Locale locale = Locale.getDefault();
        Product product = creator.createProduct();
        Assert.assertEquals(locale.getCountry(), product.getName());
    }
}