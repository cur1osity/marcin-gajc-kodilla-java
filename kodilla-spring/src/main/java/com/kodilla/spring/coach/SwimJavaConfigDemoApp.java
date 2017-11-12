package com.kodilla.spring.coach;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {


        // load the spring configuration file

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);


        // retrieve bean form spring container

        Coach theCoach = context.getBean("swimCoach", Coach.class);

        // call methods on the bean

        System.out.println(theCoach.getDailyWorkout());

        // call second method based on dependency

        System.out.println(theCoach.getDailyFortune());

        // close the context

        context.close();

    }
}
