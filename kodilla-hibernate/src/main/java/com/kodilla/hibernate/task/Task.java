package com.kodilla.hibernate.task;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "TASKS")
public class Task {
    private int id;
    private String description;
    private Date created;
    private int duration;

    public Task(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreated() {
        return created;
    }

    public int getDuration() {
        return duration;
    }
}