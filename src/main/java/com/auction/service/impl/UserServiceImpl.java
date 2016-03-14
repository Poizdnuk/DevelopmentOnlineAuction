package com.auction.service.impl;


import com.auction.model.User;
import com.auction.model.UserRole;
import com.auction.repository.UserRepository;
import com.auction.repository.UserRoleRepository;
import com.auction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service("userService")
public class UserServiceImpl implements UserService, UserDetailsService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User getOne(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public List<User> findAll(Sort var1) {
        return userRepository.findAll(var1);
    }

    @Override
    public User saveAndFlush(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public User findByUserLogin(String login) {
        return userRepository.findByUserLogin(login);
    }

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(final String login) throws UsernameNotFoundException {
        User user = findByUserLogin(login);
        System.out.println(user.toString());
        List<GrantedAuthority> authorities = buildUserAuthority(user.getUserRole());
        System.out.println(authorities);
        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(), true, true, true, true, authorities);

    }

    private List<GrantedAuthority> buildUserAuthority(List<UserRole> listUserRole) {
        return listUserRole.stream()
                .map(userRole -> new SimpleGrantedAuthority("ROLE_" + userRole.getRole().toString()))
                .collect(Collectors.toList());
    }

    @Override
    public void save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setUserRole(new ArrayList<>(userRoleRepository.findAll()));
        userRepository.save(user);
    }
}
