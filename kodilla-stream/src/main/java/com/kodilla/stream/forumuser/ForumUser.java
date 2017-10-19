package com.kodilla.stream.forumuser;

import lombok.Value;

import java.time.LocalDate;

@Value
public class ForumUser {

    public enum Gender {
        M, F
    }

    private int id;
    private String name;
    private Gender gender;
    private LocalDate birthDate;
    private int postCount;

}
