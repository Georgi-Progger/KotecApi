package com.example.curseapiapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "curses")
@Data
@NoArgsConstructor
public class CurseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "comment")
    private String comment;

    @ManyToMany(mappedBy = "curses") // Ссылка на поле "curses" в классе UserEntity
    private List<UserEntity> users;
}
