package com.example.dao;

import com.example.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 吴亚斌
 * create : 2019-04-21 10:51
 * description
 */
@Component
public interface UserDao {
    User findUserById(int id);
}
