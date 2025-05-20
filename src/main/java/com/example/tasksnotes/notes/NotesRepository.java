package com.example.tasksnotes.notes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<NotesEntity, Long> {
}
