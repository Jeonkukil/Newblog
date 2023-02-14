package shop.mtcoding.newblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @GetMapping("/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }

    @GetMapping("/loginForm")
    public String loginForm(){
        return "user/loginForm";
    }

   @GetMapping("/user/updateForm")
   public String updateForm(){
        return "user/updateForm";
   } 

   @GetMapping("/logout")
   public String logout() {
        return "redirect:/";
   }
}