package com.kodilla.stream.forum;

        import org.junit.Assert;
        import org.junit.Test;

public class ForumUserTestSuite {
    @Test
    public void testGetLocationsOfFriends() {
        //Given
        //Create users
        ForumUser user1 = new ForumUser("alan01", "Alan Kosovsky", "A");
        ForumUser user2 = new ForumUser("ethanreard", "Ethan Reard", "B");
        ForumUser user3 = new ForumUser("eRiK", "Erik Hull", "C");
        ForumUser user4 = new ForumUser("booth", "Mya Booth", "D");
        ForumUser user5 = new ForumUser("nicole1987", "Nicole Lee", "E");
        ForumUser user6 = new ForumUser("nobody", "Briana Williams", "F");
        ForumUser user7 = new ForumUser("bigmac", "Robert Macdonald", "G");
        ForumUser user8 = new ForumUser("thebigone", "Clay Small", "H");
        ForumUser user9 = new ForumUser("user121212", "Marisa Frank", "I");
        ForumUser user10 = new ForumUser("lawyer", "Lexie John", "J");

        //When
        //Create relations for user1
        user1.addFriend(user3);
        user1.addFriend(user7);
        user1.addFriend(user10);
        //Create relations for user3
        user3.addFriend(user1);
        user3.addFriend(user7);
        user3.addFriend(user2);
        user3.addFriend(user9);
        //Create relations for user7
        user7.addFriend(user1);
        user7.addFriend(user3);
        //Create relations for user10
        user10.addFriend(user1);
        user10.addFriend(user8);
        //Create relations for user2
        user2.addFriend(user3);
        //Create relations for user9
        user9.addFriend(user3);

        //Then
        //user1 has 3 friends with following locations:
        //   user3:  "C"
        //   user7:  "G"
        //   user10: "J"
        Assert.assertEquals(3, user1.getLocationsOfFriends().size());
        Assert.assertTrue(user1.getLocationsOfFriends().contains("C"));
        Assert.assertTrue(user1.getLocationsOfFriends().contains("G"));
        Assert.assertTrue(user1.getLocationsOfFriends().contains("J"));
        Assert.assertFalse(user1.getLocationsOfFriends().contains("Orlando"));
    }

    @Test
    public void testGetLocationsOfFriendsOfFriends() {
        //Given
        //Create users
        ForumUser user1 = new ForumUser("alan01", "Alan Kosovsky", "A");
        ForumUser user2 = new ForumUser("ethanreard", "Ethan Reard", "B");
        ForumUser user3 = new ForumUser("eRiK", "Erik Hull", "C");
        ForumUser user4 = new ForumUser("booth", "Mya Booth", "D");
        ForumUser user5 = new ForumUser("nicole1987", "Nicole Lee", "E");
        ForumUser user6 = new ForumUser("nobody", "Briana Williams", "F");
        ForumUser user7 = new ForumUser("bigmac", "Robert Macdonald", "G");
        ForumUser user8 = new ForumUser("thebigone", "Clay Small", "H");
        ForumUser user9 = new ForumUser("user121212", "Marisa Frank", "I");
        ForumUser user10 = new ForumUser("lawyer", "Lexie John", "J");

        //When
        //Create relations for user1
        user1.addFriend(user3);
        user1.addFriend(user7);
        user1.addFriend(user10);
        //Create relations for user3
        user3.addFriend(user1);
        user3.addFriend(user7);
        user3.addFriend(user2);
        user3.addFriend(user9);
        //Create relations for user7
        user7.addFriend(user1);
        user7.addFriend(user3);
        //Create relations for user10
        user10.addFriend(user1);
        user10.addFriend(user8);
        //Create relations for user2
        user2.addFriend(user3);
        //Create relations for user9
        user9.addFriend(user3);

        //Then
        //user1 has 3 friends with following friends and their locations:
        //   user3:  user1: - should be skipped ("this" in context of user1)
        //           user7: "G"
        //           user2: "B"
        //           user9: "I"
        //   user7:  user1: - should be skipped ("this" in context of user1)
        //           user3: "C"
        //   user10: user1: - should be skipped ("this" in context of user1)
        Assert.assertEquals(5, user1.getLocationsOfFriendsOfFriends().size());
        Assert.assertTrue(user1.getLocationsOfFriends().contains("J"));
        Assert.assertTrue(user1.getLocationsOfFriendsOfFriends().contains("B"));
    }
}