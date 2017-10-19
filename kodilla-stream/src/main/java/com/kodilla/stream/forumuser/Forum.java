package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {

        theUserList.add(new ForumUser(1,"Dylan",
                ForumUser.Gender.M, LocalDate.of(1963,12,1),
                100));
        theUserList.add(new ForumUser(2,"Phoebe",
                ForumUser.Gender.F, LocalDate.of(1980,8,9),
                15));
        theUserList.add(new ForumUser(3,"Morgan",
                ForumUser.Gender.F, LocalDate.of(1900,2,16),
                0));
        theUserList.add(new ForumUser(4,"Ryan",
                ForumUser.Gender.M, LocalDate.of(1948,7,6),
                1));
        theUserList.add(new ForumUser(5,"Aimee",
                ForumUser.Gender.F, LocalDate.of(1967,4,13),
                10));
        theUserList.add(new ForumUser(6,"Elvis",
                ForumUser.Gender.M, LocalDate.of(1800,12,1),
                10000));
        theUserList.add(new ForumUser(7,"Rupert",
                ForumUser.Gender.M, LocalDate.of(1922,7,6),
                33));

    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);
    }

}
