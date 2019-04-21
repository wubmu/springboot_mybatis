package com.example.service;

import com.example.model.User;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 吴亚斌
 * create : 2019-04-21 11:05
 * description
 */
public interface UserService {
    User findUserById(int id);
}
