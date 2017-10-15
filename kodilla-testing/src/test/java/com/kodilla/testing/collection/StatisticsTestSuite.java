package com.kodilla.testing.collection;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCalculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    private List<String> createUsers(int count) {

        List<String> expectedList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            expectedList.add("name");
        }
        return expectedList;
    }


    @Test
    public void Should_Have0Comments_When_CommentCountIs0() {

        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticCalculator = new StatisticsCalculator();
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        statisticCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticCalculator.getCommentCount(), 0);

    }

    @Test
    public void Should_Have0Posts_When_PostCountIs0() {

        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticCalculator = new StatisticsCalculator();
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        statisticCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticCalculator.getPostCount(), 0);

    }

    @Test
    public void Should_Have1000Posts_When_PostCountIs1000() {

        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticCalculator = new StatisticsCalculator();
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        statisticCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1000, statisticCalculator.getPostCount(), 0);

    }

    @Test
    public void Should_BeTrue_When_PostCountIsLowerThanCommentsCount() {

        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticCalculator = new StatisticsCalculator();
        when(statisticsMock.postsCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        statisticCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(statisticCalculator.getPostCount() < statisticCalculator.getCommentCount());
    }

    @Test
    public void Should_BeTrue_When_PostCountIsHigherThanCommentsCount() {

        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticCalculator = new StatisticsCalculator();
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(5);

        //When
        statisticCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(statisticCalculator.getPostCount() > statisticCalculator.getCommentCount());
    }

    @Test
    public void Should_Have0Users_When_UserCountIs0() {

        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticCalculator = new StatisticsCalculator();
        when(statisticsMock.usersNames()).thenReturn(createUsers(0));

        //When
        statisticCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticCalculator.getUserCount(), 0);

    }


    @Test
    public void Should_Have100Users_When_UserCountIs100() {

        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticCalculator = new StatisticsCalculator();
        when(statisticsMock.usersNames()).thenReturn(createUsers(100));

        //When
        statisticCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, statisticCalculator.getUserCount(), 0);

    }

}
