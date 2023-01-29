package com.goit.feature.mvc.notes;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@RequiredArgsConstructor
@Service
public class NoteService {
    private final NoteRepository repository;

    public List<Note> listAll() {
        return repository.findAll();
    }

    public synchronized Note add(Note note) {
        note.setId(UUID.randomUUID().toString());
        return repository.save(note);
    }

    public Note getById(String id) {
        return repository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public synchronized void deleteById(String id) {
        repository.deleteById(id);
    }

    public synchronized void update(Note note) {
        repository.save(note);
    }
}
