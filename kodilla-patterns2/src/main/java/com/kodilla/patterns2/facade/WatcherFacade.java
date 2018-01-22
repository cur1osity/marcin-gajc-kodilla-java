package com.kodilla.patterns2.facade;

import com.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatcherFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherFacade.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + "&& args(orderDto, userId)&& target(object) " )
    public void logEvent2(OrderDto orderDto, Long userId, Object object){
        LOGGER.info("\nClass = " + object.getClass() + " ,\nOrderDto orderDto = " + orderDto.toString()+ "\nLong userId = " + userId + "\n");
    }
}