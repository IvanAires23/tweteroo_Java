package com.tweteroo.tweteroo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tweteroo.tweteroo.dtos.UserDTO;
import com.tweteroo.tweteroo.models.UserModel;
import com.tweteroo.tweteroo.repositories.UserRepository;

@Service
public class UserService {
    final UserRepository userRepository;

    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Optional<UserModel> save(UserDTO dto){
        UserModel user = new UserModel(dto);
        if(!userRepository.findByUsername(dto.getUsername()).isEmpty()){
            return Optional.empty();
        }
        return Optional.of(userRepository.save(user));
    }
}
