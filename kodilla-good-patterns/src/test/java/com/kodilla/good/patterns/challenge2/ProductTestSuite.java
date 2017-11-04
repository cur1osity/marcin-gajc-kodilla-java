package com.kodilla.good.patterns.challenge2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

public class ProductTestSuite {

    private OrderRequest orderRequest;
    private ProductRepository productRepository;
    private ProductOrderService productOrderService;
    private OrderProcessor orderProcessor;

    private OrderRequest retrieve(boolean isCorrect) {

        User user = new User("Marcin Gajc", "marcin.gajc@gmail.com");

        LocalDateTime orderDate = LocalDateTime.of(2017,9,1,12,0);

        Product product = new Product("toothbrush",10);

        return new OrderRequest(user, product, orderDate, isCorrect);
    }


    @Before
    public void setup() {

        productRepository = new ProductRepository();
        productOrderService = new ProductOrderService();
        orderProcessor = new OrderProcessor(new MailService(), productOrderService, productRepository);
    }

    @After
    public void stars() {
        System.out.println("********************************************");
    }

    @Test
    public void Should_Have_1_Element_List_Size_When_Order_is_Correct() {

        //given
        // @Before +
        orderRequest = retrieve(true);

        //when
        orderProcessor.process(orderRequest);
        int numberOfOrders = productRepository.getOrders().size();

        //then
        Assert.assertEquals(1, numberOfOrders);

    }

    @Test
    public void Should_Have_0_Element_List_Size_When_Order_is_not_Correct() {

        //given
        //@Before +
        orderRequest = retrieve(false);
        orderProcessor = new OrderProcessor(new MailService(), productOrderService, productRepository);


        //when
        orderProcessor.process(orderRequest);
        int numberOfOrders = productRepository.getOrders().size();

        //then
        Assert.assertEquals(0, numberOfOrders);

    }


    @Test
    public void Should_Have_Dto_with_parameter_True_When_Order_is_correct() {

        //given
        //@Before +
        orderRequest = retrieve(true);


        //when
        ProductDto dto = orderProcessor.process(orderRequest);
        boolean isTrue = dto.isOrdered();

        //then
        Assert.assertTrue(isTrue);

    }

    @Test
    public void Should_Have_Dto_with_parameter_False_When_Order_is_not_correct() {

        //given
        //@Before +
        orderRequest = retrieve(false);
        orderProcessor = new OrderProcessor(new MailService(), productOrderService, productRepository);

        //when
        ProductDto dto = orderProcessor.process(orderRequest);
        boolean isFalse = dto.isOrdered();

        //then
        Assert.assertFalse(isFalse);

    }
}
