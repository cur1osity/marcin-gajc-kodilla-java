package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    private ApplicationContext context;
    private Calculator calculator;


    @Before
    public void setupSpring() {
        context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        calculator = context.getBean(Calculator.class);

    }

    @Test
    public void Should_return_9_When_add_method_is_used() {
        //given
        //@Before

        //when
        double result = calculator.add(4, 5);

        //then
        Assert.assertEquals(9, result, 0.01);
    }

    @Test
    public void Should_return_minus1_When_sub_method_is_used() {
        //given
        //@Before

        //when
        double result = calculator.sub(4, 5);

        //then
        Assert.assertEquals(-1, result, 0.01);
    }

    @Test
    public void Should_return_20_When_mul_method_is_used() {
        //given
        //@Before

        //when
        double result = calculator.mul(4, 5);

        //then
        Assert.assertEquals(20, result, 0.01);
    }

    @Test
    public void Should_return_08_When_div_method_is_used() {
        //given
        //@Before

        //when
        double result = calculator.div(4, 5);

        //then
        Assert.assertEquals(0.8, result, 0.01);
    }
}
