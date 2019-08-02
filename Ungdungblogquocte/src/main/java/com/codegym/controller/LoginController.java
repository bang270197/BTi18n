package com.codegym.controller;

import com.codegym.Model.Credential;
import com.codegym.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("user")
public class LoginController {

    @GetMapping("/show-login")
    public String Showlogin(Model model){
        model.addAttribute("credential",new Credential());
        return "login";
    }

    @PostMapping("/loginUser")
    public String showLogin(@ModelAttribute Credential credential,Model model){
        User user=new User();
        user.setUserName(credential.getUserName());
        model.addAttribute("users",user);
        return "result";
    }
}
