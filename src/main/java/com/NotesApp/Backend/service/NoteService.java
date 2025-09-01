package com.NotesApp.Backend.service;

import com.NotesApp.Backend.model.Note;
import com.NotesApp.Backend.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.Optional;
@Service
public class NoteService {
    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll(); 
    }

    public Optional<Note> getNoteById(Long id) {
        return noteRepository.findById(id);
    } 
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    public Optional<Note> updateNote(Long id, Note updatedNote) {
        return noteRepository.findById(id).map(note -> {
            note.setTitle(updatedNote.getTitle());
            note.setContent(updatedNote.getContent());
            return noteRepository.save(note);
        });
    }
     public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }
}
