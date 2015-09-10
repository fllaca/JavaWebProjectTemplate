package com.persefone.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.persefone.domain.User;
import com.persefone.repositories.UserRepository;
 
@Controller
@RequestMapping("/users")
public class UsersController {
 
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
    	UserRepository uRepo = new UserRepository();
    	User user = uRepo.getUser(1L);
        model.addAttribute("greeting", "Hello World from user " + user.getUsername());
        
        
        
        return "users";
    }
 
    @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
        return "user";
    }
 
}