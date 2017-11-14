package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {

    @Bean
    public LibraryDbController libraryDbController() {
        return new LibraryDbController();
    }

    @Bean
    @Autowired
    public Library library(LibraryDbController libraryDbController) {
        return new Library(libraryDbController);
    }
}