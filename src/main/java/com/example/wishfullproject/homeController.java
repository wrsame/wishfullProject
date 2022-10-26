package com.example.wishfullproject;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {


  @GetMapping("/")
  public String frontpage(){
    return "Frontpage";
  }


  @GetMapping("profile")
  public String profilepage(){
    return "Profile";
  }


}
