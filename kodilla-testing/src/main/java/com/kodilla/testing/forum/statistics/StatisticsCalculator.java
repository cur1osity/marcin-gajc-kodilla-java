package com.kodilla.testing.forum.statistics;


public class StatisticsCalculator {

    private double userCount;
    private double postCount;
    private double commentCount;
    private double postCountAvg;
    private double commentCountAvg;
    private double commentOnPostAvg;
    private Statistics statistics;


    public double getUserCount() {
        return userCount;
    }

    public double getPostCount() {
        return postCount;
    }

    public double getCommentCount() {
        return commentCount;
    }

    public double getPostCountAvg() {
        return postCountAvg;
    }

    public double getCommentCountAvg() {
        return commentCountAvg;
    }

    public double getCommentOnPostAvg() {
        return commentOnPostAvg;
    }

    public void calculateAdvStatistics(Statistics statistics){

    commentCount = statistics.commentsCount();
    userCount = statistics.usersNames().size();
    postCount = statistics.postsCount();
    postCountAvg = postCount/userCount;
    commentCountAvg = commentCount/userCount;
    commentOnPostAvg = postCount/commentCount;

    }

    public void showStatistics(){

        calculateAdvStatistics(statistics);

        // i do tego wyprintowac te rzeczy np System.out.println(userCount); ????
    }
}
