package com.tweteroo.tweteroo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tweteroo.tweteroo.dtos.TweetDTO;
import com.tweteroo.tweteroo.models.TweetModel;
import com.tweteroo.tweteroo.models.UserModel;
import com.tweteroo.tweteroo.repositories.TweetRepository;

@Service
public class TweetService {
    final TweetRepository tweetRepository;
    final UserService userService;

    TweetService(TweetRepository tweetRepository, UserService userService){
        this.tweetRepository = tweetRepository;
        this.userService = userService;
    }

    public Optional<Object> save(TweetDTO dto){
        Optional<UserModel> user = userService.findUser(dto.getUserId());
        if(!user.isPresent()){ return Optional.empty();}
        TweetModel tweet = new TweetModel(dto);
        
        return Optional.of(tweetRepository.save(tweet));
    }
}
