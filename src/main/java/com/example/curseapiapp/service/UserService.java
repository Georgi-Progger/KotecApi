package com.example.curseapiapp.service;

import com.example.curseapiapp.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends GenericService<UserEntity, Long> {

}
