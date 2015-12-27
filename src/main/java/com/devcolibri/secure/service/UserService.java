package com.devcolibri.secure.service;

import com.devcolibri.secure.entity.User;

public interface UserService {

    User getUser(String login);

}