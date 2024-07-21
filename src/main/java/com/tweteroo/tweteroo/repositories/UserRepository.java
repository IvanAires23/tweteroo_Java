package com.tweteroo.tweteroo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweteroo.tweteroo.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    
}
