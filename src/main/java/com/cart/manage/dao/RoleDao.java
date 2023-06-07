package com.cart.manage.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cart.manage.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
