package com.dw.dao.interfaces;

import com.dw.entity.User;

public interface UserDAO extends ParentDAO{
    public void addUser(User user);
    public String getPassword(User user);     
}
