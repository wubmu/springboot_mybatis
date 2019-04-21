package com.example.model;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 吴亚斌
 * create : 2019-04-21 10:51
 * description
 */
public class User {
    private int id;
    private String password ;

    public User(int id, String password) {
        this.id = id;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}

