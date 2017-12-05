package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.dao.InvoiceDao;
import com.kodilla.hibernate.dao.ItemDao;
import com.kodilla.hibernate.dao.ProductDao;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){

        Product product1 = new Product("Pencil");
        Product product2 = new Product("Pencil");

        Item item1 = new Item(1,new BigDecimal("100"));
        Item item2 = new Item(2,new BigDecimal("100"));

        item1.setProduct(product1);
        item2.setProduct(product1);

        Invoice invoice1 = new Invoice("123");
     //   Invoice invoice2 = new Invoice("xyz");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);

      //  invoice2.getItems().add(item2);


        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);

        invoiceDao.save(invoice1);
     //   invoiceDao.save(invoice2);

    }

//    @Test
//    public void testInvoiceDaoSave2(){
//
//        Item item2 = new Item(3, new BigDecimal("100"));
//
//        item2.setProduct(product);
//
//        Invoice invoice2 = new Invoice("xyz");
//
//        invoice2.getItems().add(item2);
//
//        item2.setInvoice(invoice2);
//
//        invoiceDao.save(invoice2);
//
//    }
}
