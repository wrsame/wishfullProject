package com.example.wishfullproject.UserPackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class userController{
    @Controller
    public static class UserController {

        @GetMapping("/login")
        public String login(){
            return "Login";
        }
        @GetMapping("/signup")
        public String signup() {
            return "SignUp";
        }

        @GetMapping("/wishlists")
        public String viewWishlists(){
            return "AllWishlists";
        }


        @GetMapping("/addwishlist")
        public String addWishList(){
            return "AddWishlist";
        }

        @GetMapping("profile")
        public String profilepage(){
            return "Profile";


        }

    }
}
