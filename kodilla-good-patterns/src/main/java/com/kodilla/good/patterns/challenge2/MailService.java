package com.kodilla.good.patterns.challenge2;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {

        System.out.println("Email was send to: " + user.getEmail());

    }
}
