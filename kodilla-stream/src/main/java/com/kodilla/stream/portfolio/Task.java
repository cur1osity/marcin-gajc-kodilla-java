package com.kodilla.stream.portfolio;

import lombok.Value;

import java.time.LocalDate;

@Value
public final class Task {
    private final String title;
    private final String description;
    private final User assignedUser;
    private final User creator;
    private final LocalDate created;
    private final LocalDate deadline;

}