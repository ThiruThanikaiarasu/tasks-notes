package com.example.tasksnotes.notes;

import com.example.tasksnotes.common.BaseEntity;
import com.example.tasksnotes.tasks.TaskEntity;
import jakarta.persistence.*;

@Entity(name = "notes")
public class NoteEntity extends BaseEntity {

    @Column(name= "title", nullable = false)
    private String title;

    @Column(name= "body", nullable = false)
    private String body;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "task_id", referencedColumnName = "id")
    private TaskEntity task;
}
