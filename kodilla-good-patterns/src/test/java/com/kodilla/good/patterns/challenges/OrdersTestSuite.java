package com.kodilla.good.patterns.challenges;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OrdersTestSuite {

    private OrderRequestRetriever orderRequestRetriever;
    private OrderRequest orderRequest;
    private ProductRepository productRepository;
    private ProductOrderService productOrderService;
    private OrderProcessor orderProcessor;


    @Before
    public void setup() {

        orderRequestRetriever = new OrderRequestRetriever();
        orderRequest = orderRequestRetriever.retrieve();
        productRepository = new ProductRepository();
        productOrderService = new ProductOrderService(true);
        orderProcessor = new OrderProcessor(new MailService(), productOrderService, productRepository);
    }

    @After
    public void stars() {
        System.out.println("********************************************");
    }

    @Test
    public void Should_Have_1_Element_List_Size_When_Order_is_Correct() {

        //given
        // @Before

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
        ProductOrderService productOrderService = new ProductOrderService(false);
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
        //@Before


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
        ProductOrderService productOrderService = new ProductOrderService(false);
        orderProcessor = new OrderProcessor(new MailService(), productOrderService, productRepository);

        //when
        ProductDto dto = orderProcessor.process(orderRequest);
        boolean isFalse = dto.isOrdered();

        //then
        Assert.assertFalse(isFalse);

    }
}
