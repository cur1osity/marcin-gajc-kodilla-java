package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void Should_return_proper_publisher_name_When_sharePost_is_used() {

        //given
        User a = new Millenials("FacebookUser");
        User b = new YGeneration("TwitterUser");
        User c = new ZGeneration("SnapchatUser");

        //when
        String aShouldUse = a.sharePost();
        String bShouldUse = b.sharePost();
        String cShouldUse = c.sharePost();

        //then
        Assert.assertEquals("Facebook", aShouldUse);
        Assert.assertEquals("Twitter", bShouldUse);
        Assert.assertEquals("Snapchat", cShouldUse);
    }

    @Test
    public void Should_change_publisher_strategy_When_setSocialPublisherStrategy_is_used() {

        //given
        User a = new Millenials("FacbookUser");

        //when
        a.setSocialPublisherStrategy(new SnapchatPublisher());
        String aShouldUse = a.sharePost();

        //then
        Assert.assertEquals("Snapchat", aShouldUse);
    }
}
