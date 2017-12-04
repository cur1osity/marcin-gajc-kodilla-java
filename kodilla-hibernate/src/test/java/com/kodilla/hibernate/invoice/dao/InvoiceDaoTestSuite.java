package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.dao.InvoiceDao;
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
        Item item1 = new Item(2,new BigDecimal("100"));
        item1.setProduct(product1);
        Invoice invoice1 = new Invoice("123");
        invoice1.getItems().add(item1);
        item1.setInvoice(invoice1);
        invoiceDao.save(invoice1);

    }
}
