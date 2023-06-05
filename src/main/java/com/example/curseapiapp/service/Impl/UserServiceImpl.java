package com.example.curseapiapp.service.Impl;

import com.example.curseapiapp.entity.UserEntity;
import com.example.curseapiapp.repository.UserRepository;
import com.example.curseapiapp.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public List<UserEntity> loadAll() {
        return null;
    }

    @Override
    public UserEntity create(UserEntity userEntity) {
        return null;
    }

    @Override
    public UserEntity getById(Long aLong) {
        return null;
    }

    @Override
    public UserEntity update(UserEntity userEntity) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
