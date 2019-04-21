package com.example.dao;

import com.example.BaseTest;
import com.example.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 吴亚斌
 * create : 2019-04-21 11:22
 * description
 */
public class UserDaoTest extends BaseTest {
    @Autowired
    UserDao dao;
    @Test
    public void findUserById() {
        System.out.println(dao.findUserById(1));
    }
}