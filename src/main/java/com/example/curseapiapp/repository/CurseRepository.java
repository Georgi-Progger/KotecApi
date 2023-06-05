package com.example.curseapiapp.repository;

import com.example.curseapiapp.entity.CurseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurseRepository extends JpaRepository<CurseEntity, Long> {

}
