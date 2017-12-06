package com.kodilla.hibernate3.invoice.dao;

import com.kodilla.hibernate3.dao.InvoiceDao;
import com.kodilla.hibernate3.dao.ItemDao;
import com.kodilla.hibernate3.dao.ProductDao;
import com.kodilla.hibernate3.invoice.Invoice;
import com.kodilla.hibernate3.invoice.Item;
import com.kodilla.hibernate3.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback(false)
public class InvoiceDaoTestSuite {

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given

        itemDao.deleteAll();
        productDao.deleteAll();
        invoiceDao.deleteAll();

        Product product1 = new Product("Milk");
        Product managedProduct = productDao.save(product1);

        Item item1 = new Item(1,new BigDecimal("100"));
        Item item2 = new Item(2,new BigDecimal("100"));

        item1.setProduct(managedProduct);
        item2.setProduct(managedProduct);

        Invoice invoice1 = new Invoice("123");
        Invoice invoice2 = new Invoice("xyz");

        invoice1.getItems().add(item1);
        invoice2.getItems().add(item2);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice2);

        //when

        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);
        int idOfInvoice1 = invoice1.getId();
        int idOfInvoice2 = invoice2.getId();
        int idOfProduct1 = item1.getProduct().getId();
        int idOfProduct2 = item2.getProduct().getId();

        //then

        Assert.assertNotEquals(0, idOfInvoice1);
        Assert.assertNotEquals(0, idOfInvoice2);
        Assert.assertNotEquals(idOfInvoice1, idOfInvoice2);
        Assert.assertEquals(idOfProduct1, idOfProduct2);

    }
}
