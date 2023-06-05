package com.example.curseapiapp.service.Impl;

import com.example.curseapiapp.entity.CurseEntity;
import com.example.curseapiapp.repository.CurseRepository;
import com.example.curseapiapp.service.CurseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurseServiceImpl implements CurseService {
    private CurseRepository curseRepository;

    @Override
    public List<CurseEntity> loadAll() {
        return null;
    }

    @Override
    public CurseEntity create(CurseEntity curseEntity) {
        return null;
    }

    @Override
    public CurseEntity getById(Long aLong) {
        return null;
    }

    @Override
    public CurseEntity update(CurseEntity curseEntity) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    public CurseServiceImpl(CurseRepository curseRepository) {
        this.curseRepository = curseRepository;
    }
}
