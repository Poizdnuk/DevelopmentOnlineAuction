package com.auction.service.impl;

import com.auction.repository.UserRoleRepository;

import com.auction.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

}
