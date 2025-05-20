package com.example.tasksnotes.tasks;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<TaskEntity, Long> {
}
