package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SocialPublisher;

public abstract class User {

    final private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost() {

        return socialPublisher.share();
    }

    public void setSocialPublisherStrategy(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

}

