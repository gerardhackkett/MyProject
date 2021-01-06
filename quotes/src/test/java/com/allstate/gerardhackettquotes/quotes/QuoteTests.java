package com.allstate.gerardhackettquotes.quotes;

import com.allstate.gerardhackettquotes.quotes.entities.Quote;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
import org.aspectj.lang.annotation.Before;
import org.springframework.util.Assert;

public class QuoteTests {
    Quote quote;
    int i = 0;

//    @Before
//    public void setUp(){
//        quote = new Quote();
//    }


   // @Test
//    public void testCreateEmptyQuote(){
//
//        Assert.assertEquals(0,quote.getQuote());
//
//    }
//
//    @Test
//    public void testAddSingleProductToInvoice(){
//
//        product = new Product("T15555", "Java for beginners", 1,10.00);
//        invoice.addProduct(product);
//        Assert.assertEquals(1,invoice.getProductCount());
//    }


//    @Test
//    public void testAddSingleProductToFindTotal(){
//
//        product = new Product("T15555", "Java for beginners", 1,10.00);
//        invoice.addProduct(product);
//        Assert.assertEquals(10.00,invoice.productTotal(),0.00);
//    }



//    @Test
//    public void testAddMultipleProductsToInvoiceToFindTotal(){
//        product = new Product("T14444", "Python for beginners", 1,10.00);
//        invoice.addProduct(product);
//        product = new Product("T14444", "Python for beginners", 1,15.00);
//        invoice.addProduct(product);
//        Assert.assertEquals(2,invoice.getProductCount());
//        Assert.assertEquals(25.00,invoice.productTotal(),0.0);
//    }


//
//    @Test
//    public void testVATCode(){
//        product = new Product("T14444", "Python for beginners", 1,10.00);
//        Assert.assertEquals("T1", product.VATCodeOfProduct());
//    }
//
//    @Test
//    public void testVATRate(){
//        product = new Product("T14444", "Python for beginners", 1,10.00);
//        Assert.assertEquals(0.2,product.calculateVATRate(), 0.0);
//    }
//
//    @Test
//    public void testCalculateVATAmount(){
//        product = new Product("T14444", "Python for beginners", 1,10.00);
//        Assert.assertEquals(2.0,product.calculateVATAmount(),0.0);
//    }
//
//
//    @Test
//    public void testCalculatePrice(){
//        //double quote = 100 * seatsFactor * capacityFactor * marketValueFactor;
//        product = new Product("T14444", "Python for beginners", 1,10.00);
//        Assert.assertEquals(12.00, product.caculateTotalCostOfInvoice(),0.0);
//    }


}
