package com.oogie.velocityexample.da;

import com.oogie.velocityexample.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getUsers();
    public void insertBatch();
}