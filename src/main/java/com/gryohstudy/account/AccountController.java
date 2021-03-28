package com.gryohstudy.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/sign-up")
    public String signUpForm(Model model){
        model.addAttribute("signUpForm", new SignUpForm());
        //model.addAttribute(new SignUpForm()); // 보내는 객체와 이름이 camel case인 경우 가능
        return "account/sign-up";
    }
}
