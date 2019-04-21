package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 吴亚斌
 * create : 2019-04-21 11:36
 * description
 */
@Service
public class UserServiceImpl implements UserService

{
    @Autowired
    UserDao dao;
    @Override
    public User findUserById(int id) {
        return dao.findUserById(id);
    }
}
