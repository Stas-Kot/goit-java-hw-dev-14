package com.goit.feature.mvc.notes;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Data
public class Note {
    @Id
    private String id;
    @Column
    private String title;
    @Column
    private String content;
}
