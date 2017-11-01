package com.kodilla.good.patterns.challenges;

import org.junit.Assert;
import org.junit.Test;

public class OrdersTestSuite {

    @Test
    public void Should_Have_1_Element_List_Size_When_Order_is_Correct() {

        //given
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        ProductRepository productRepository = new ProductRepository();
        ProductOrderService productOrderService = new ProductOrderService(true);
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), productOrderService, productRepository);
        orderProcessor.process(orderRequest);

        //when
        int numberOfOrders = productRepository.getOrders().size();

        //then
        Assert.assertEquals(1, numberOfOrders);

    }

    @Test
    public void Should_Have_0_Element_List_Size_When_Order_is_not_Correct() {

        //given
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        ProductRepository productRepository = new ProductRepository();
        ProductOrderService productOrderService = new ProductOrderService(false);
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), productOrderService, productRepository);
        orderProcessor.process(orderRequest);

        //when
        int numberOfOrders = productRepository.getOrders().size();

        //then
        Assert.assertEquals(0, numberOfOrders);

    }


    @Test
    public void Should_Have_Dto_with_parameter_True_When_Order_is_correct() {

        //given
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        ProductRepository productRepository = new ProductRepository();
        ProductOrderService productOrderService = new ProductOrderService(true);
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), productOrderService, productRepository);
        ProductDto dto = orderProcessor.process(orderRequest);

        //when
        boolean isTrue = dto.isOrdered();

        //then
        Assert.assertTrue(isTrue);

    }

    @Test
    public void Should_Have_Dto_with_parameter_False_When_Order_is_not_correct() {

        //given
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        ProductRepository productRepository = new ProductRepository();
        ProductOrderService productOrderService = new ProductOrderService(false);
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), productOrderService, productRepository);
        ProductDto dto = orderProcessor.process(orderRequest);

        //when
        boolean isFalse = dto.isOrdered();

        //then
        Assert.assertFalse(isFalse);

    }
}
