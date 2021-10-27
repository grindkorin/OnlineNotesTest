package com.example.notes.services.db_services;

import com.example.notes.models.Note;
import com.example.notes.repository.NoteRepository;
import com.example.notes.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    NoteRepository repository;

    @Override
    public List<Note> findAll() {
        return repository.findAll();
    }

    @Override
    public Note save(Note note) {
        return repository.save(note);
    }

    @Override
    public Note getById(Integer id) {
        return repository.getById(id);
    }

    @Override
    public List<Note> saveAll(List<Note> users) {
        return repository.saveAll(users);
    }
}
