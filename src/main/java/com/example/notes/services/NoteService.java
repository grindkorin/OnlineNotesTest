package com.example.notes.services;

import com.example.notes.models.Note;

import java.util.List;

public interface NoteService {
    List<Note> findAll();
    Note save(Note note);
    Note getById(Integer id);
    List<Note> saveAll(List<Note> users);
}
