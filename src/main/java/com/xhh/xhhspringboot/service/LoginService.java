package com.xhh.xhhspringboot.service;

import com.xhh.xhhspringboot.domin.Role;
import com.xhh.xhhspringboot.domin.User;

import java.util.Map;

public interface LoginService {

    public User addUser(Map<String, Object> map);

//    public Role addRole(Map<String, Object> map);

    public User findByName(String name);
}
