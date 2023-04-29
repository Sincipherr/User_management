package com.geekster.UserManagementSystem.Controller;

import com.geekster.UserManagementSystem.Model.User;
import com.geekster.UserManagementSystem.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService us;
    @GetMapping(value = "/getalluser")
    public List<User> getAlluser(){
        return us.getuser();
    }

    @PostMapping(value = "/addUser")
    public String adduser(@Valid @RequestBody User user){
        return us.adduser(user);
    }
    @GetMapping(value = "/getUser/{userid}")
    public User getuserid(@PathVariable String userid){
        return us.getuserid(userid);
    }
    @DeleteMapping(value = "/delete/{userid}")
    public String deleteuser(@PathVariable String userid){
        return us.deleteuser(userid);
    }
    @PutMapping(value = "/updateUserInfo/{userid}/{phoneNO}")
    public String updateinfo(@PathVariable String userid,@PathVariable String phoneNO){
        return us.updateinfo(userid,phoneNO);
    }

}
