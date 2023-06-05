package com.example.curseapiapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    @Column(name = "telephone")
    private String telephone;

    @ManyToMany
    @JoinTable(
            name = "user_curse", // Имя промежуточной таблицы
            joinColumns = @JoinColumn(name = "user_id"), // Внешний ключ на таблицу users
            inverseJoinColumns = @JoinColumn(name = "curse_id") // Внешний ключ на таблицу curses
    )
    private List<CurseEntity> curses;
}