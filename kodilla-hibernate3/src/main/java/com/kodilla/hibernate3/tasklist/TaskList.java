package com.kodilla.hibernate3.tasklist;

import com.kodilla.hibernate3.task.Task;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TASKLIST")
@Data
@NoArgsConstructor
public final class TaskList {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    private int id;
    @Column(name="LISTNAME")
    private String listName;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany (
            targetEntity = Task.class,
            mappedBy = "taskList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Task> tasks = new ArrayList<>();


    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }
}