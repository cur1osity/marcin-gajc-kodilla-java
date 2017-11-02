package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenge1.OrderRequest;
import com.kodilla.good.patterns.challenge1.OrderRequestRetriever;
import com.kodilla.good.patterns.challenge1.ProductDto;
import com.kodilla.good.patterns.challenge1.ShopProcessor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShopsTestSuite {

    private OrderRequestRetriever orderRequestRetriever;
    private OrderRequest orderRequest;
    private ShopProcessor shopProcessor;


    @Before
    public void setup(){

        orderRequestRetriever = new OrderRequestRetriever();
        orderRequest = orderRequestRetriever.retrieve();
        shopProcessor = new ShopProcessor();
    }


    @Test
    public void Should_return_right_shop_name_When_order_is_correct() {

        //given
        // @Before + orderRequestRetriver

        //when
        ProductDto productDto = shopProcessor.generate(orderRequest);
        String shopName = productDto.getShop().getClass().getSimpleName();

        //given
        Assert.assertEquals("ExtraFoodShop",shopName);

    }
}
