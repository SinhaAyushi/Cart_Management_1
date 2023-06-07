package com.cart.manage.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cart.manage.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
