package com.codewithvaish.fullstackbackend.exception;

import com.codewithvaish.fullstackbackend.model.User;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not find the user with id : " + id);
    }
}
