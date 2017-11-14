package com.kodilla.spring.reader;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ReaderTestSuite {

    @Test
    public void testRead() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.reader");
        Reader reader = context.getBean(Reader.class);
        //When & Then
        reader.read();

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");



    }

    @Test
    public void testConditional1() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        //When
        boolean book2Exists = context.containsBean("book2");
        //Then
        System.out.println("Bean book2 was found in the container: " + book2Exists);
    }
}