package com.goit.feature.mvc.notes;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class Note {
    @Id
    private String id = UUID.randomUUID().toString();
    @Column
    private String title;
    @Column
    private String content;

    public Note() {
    };

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Note(String id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
