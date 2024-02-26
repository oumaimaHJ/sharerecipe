package com.oumaima.sharerecipe.service;
import com.oumaima.sharerecipe.model.User;
public interface UserService {
    public User findUserById(Long userId) throws Exception;
}
