package com.auction.controller;

import com.auction.model.User;
import com.auction.repository.UserRepository;
import com.auction.service.ItemService;
import com.auction.service.UserService;
import com.auction.service.security.SecurityService;
import com.auction.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    ItemService itemService;
    @Autowired
    UserValidator validator;
    @Autowired
    UserService userService;
    @Autowired
    SecurityService securityService;

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        model.addAttribute("message", "Auction");
        return "welcome";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(ModelMap model) {
        model.addAttribute("listUser", userService.findAll());
        model.addAttribute("listItem", itemService.getAll());
        model.addAttribute("user", getUserForm());
        return "admin";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registrationPage(ModelMap model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registerUserAccount(@ModelAttribute("user") User user,
                                      BindingResult result, Model model) {
        validator.validate(user, result);
        if (result.hasErrors()) {
            return "registration";
        }
        userService.save(user);
        securityService.autoLogin(user.getLogin(), user.getPasswordConfirm());
        return "login";
    }

    @RequestMapping(value = "/user/home", method = RequestMethod.GET)
    public String dbaPage(ModelMap model) {
        model.addAttribute("user", getUserForm());
        return "home";
    }


    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public String accessDeniedPage(ModelMap model) {
        model.addAttribute("user", getUserForm());
        return "accessDenied";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/welcome";
    }

    private String getUserForm() {
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
