package com.NotesApp.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.NotesApp.Backend.model.Note;

public  interface NoteRepository  extends JpaRepository<Note,Long>{
    
}
