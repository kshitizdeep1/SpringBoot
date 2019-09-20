package com.users.dao;

import org.springframework.data.repository.CrudRepository;

import com.user.User;

public interface UserDao extends CrudRepository<User,Long> {

}
