package com.kodilla.good.patterns.challenge2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class OrderRequest {

    private User user;
    private Product product;
    private LocalDateTime orderDate;

}
