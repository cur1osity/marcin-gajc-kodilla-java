package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> theMapOfUsers = forum.getList().stream()
                .filter(user -> user.getGender() == ForumUser.Gender.M)
                .filter(user -> user.getBirthDate().getYear() < 1997)
                .filter(user -> user.getPostCount() > 1)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        theMapOfUsers.entrySet().stream()
                .map(entry -> (entry.getKey() + ": " + entry.getValue()))
                .forEach(System.out::println);
    }
}