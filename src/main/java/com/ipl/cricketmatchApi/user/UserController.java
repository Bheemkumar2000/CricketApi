package com.ipl.cricketmatchApi.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping(path = "/si")
    public String say()
    {
        return "how are you ";
    }

    @GetMapping(path = "/ipl")
    public String[] bye()
    {
        String [] arr={"csk","pun","rcb","mi","kol","lg","luck"};

        return  arr;
    }

    @GetMapping(path = "/user")
    public User getUser()
    {
        //User user=new User("bheem","bhee@gmail.com","bheem1234");
        User user=new User();
        return  user;
    }
}
