package com.xhh.xhhspringboot.repository;

import com.xhh.xhhspringboot.domin.User;

public interface UserRepository extends BaseRepository<User,Integer>{
    User findByName(String name);

//    User findOne(String name);
}