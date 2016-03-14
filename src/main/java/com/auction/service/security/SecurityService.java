package com.auction.service.security;

public interface SecurityService {
    String findLoggedInLogin();

    void autoLogin(String login, String password);
}
