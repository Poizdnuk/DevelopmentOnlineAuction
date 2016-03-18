package com.auction.controller;

import com.auction.model.Item;
import com.auction.service.ItemService;
import com.auction.service.UserService;
import com.auction.service.security.SecurityService;
import com.auction.validator.ItemValidator;
import com.auction.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    ItemService itemService;
    @Autowired
    UserValidator validator;
    @Autowired
    ItemValidator itemValidator;
    @Autowired
    UserService userService;
    @Autowired
    SecurityService securityService;


    @RequestMapping(value = "/user/home", method = RequestMethod.GET)
    public String userPage(ModelMap model) {
        model.addAttribute("user", getUserName());
        model.addAttribute("item", new Item());
        return "home";
    }

    @RequestMapping(value = "/user/home", method = RequestMethod.POST)
    public String registerUserAccount(@Valid Item item, BindingResult result, ModelMap modelMap) {
        modelMap.addAttribute("item", item);
        itemValidator.validate(item, result);
        if (result.hasErrors()) {
            return "home";
        }
//        userService.save(user);
//        securityService.autoLogin(user.getLogin(), user.getPasswordConfirm());

        return "home";
    }

    private String getUserName() {
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails) principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }
}
