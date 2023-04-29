package com.demo.dao;

import com.demo.mapper.AdminMapper;
import com.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/29
 */
@Repository
public class AllInOneRepository {

    @Autowired
    private UserMapper user;

    @Autowired
    private AdminMapper admin;

}
