package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenge1.*;
import com.kodilla.good.patterns.challenge1.OrderRequest;
import com.kodilla.good.patterns.challenge1.Product;
import com.kodilla.good.patterns.challenge1.ProductDto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShopsTestSuite {

    private OrderRequest orderRequest;
    private ShopProcessor shopProcessor;
    private Shop shop;


    public OrderRequest retrieve(){

        Product product = new Product("eggs");

        return new OrderRequest(product, 10, shop);

    }

    @Before
    public void setup() {

        shopProcessor = new ShopProcessor();
    }


    @Test
    public void Should_return_ExtraFoodShop_name_When_order_is_correct() {

        //given
        shop = new ExtraFoodShop();
        orderRequest = retrieve();

        //when
        ProductDto productDto = shopProcessor.generate(orderRequest);
        String shopName = productDto.getShop().getClass().getSimpleName();

        //given
        Assert.assertEquals("ExtraFoodShop",shopName);

    }

    @Test
    public void Should_return_GlutenFreeShop_name_When_order_is_correct() {

        //given
        shop = new GlutenFreeShop();
        orderRequest = retrieve();

        //when
        ProductDto productDto = shopProcessor.generate(orderRequest);
        String shopName = productDto.getShop().getClass().getSimpleName();

        //given
        Assert.assertEquals("GlutenFreeShop",shopName);

    }

    @Test
    public void Should_return_HealthyShop_name_When_order_is_correct() {

        //given
        shop = new HealthyShop();
        orderRequest = retrieve();

        //when
        ProductDto productDto = shopProcessor.generate(orderRequest);
        String shopName = productDto.getShop().getClass().getSimpleName();

        //given
        Assert.assertEquals("HealthyShop",shopName);

    }
}
