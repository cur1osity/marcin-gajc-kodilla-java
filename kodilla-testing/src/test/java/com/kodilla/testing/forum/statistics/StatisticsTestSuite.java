package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void calculateAdvStatisticsTest() {

        Statistics statisticsMock = mock(Statistics.class);

        StatisticsCalculator statisticCalculator = new StatisticsCalculator();

        // gdy liczba postów = 0

        statisticCalculator.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(0, statisticCalculator.getPostCount(), 0);

        // gdy liczba postów = 1000

        when(statisticsMock.postsCount()).thenReturn(1000);
        statisticCalculator.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(1000, statisticCalculator.getPostCount(), 0);

        // gdy liczba komentarzy = 0

        Assert.assertEquals(0, statisticCalculator.getCommentCount(),0);

        // gdy liczba użytkowników = 0

        Assert.assertEquals(0,statisticCalculator.getUserCount(),0);

        // gdy liczba komentarzy > liczba postów

        when(statisticsMock.postsCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(10);
        statisticCalculator.calculateAdvStatistics(statisticsMock);
        Assert.assertTrue(statisticCalculator.getPostCount() < statisticCalculator.getCommentCount());

        // gdy liczba komentarzy < liczba postów

        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(5);
        statisticCalculator.calculateAdvStatistics(statisticsMock);
        Assert.assertTrue(statisticCalculator.getPostCount() > statisticCalculator.getCommentCount());

        // gdy liczba użytkowników = 100

        List<String> expectedList = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            expectedList.add("name");
        }

        when(statisticsMock.usersNames()).thenReturn(expectedList);
        statisticCalculator.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(100, statisticCalculator.getUserCount(),0);

    }
}
