package com.geekster.UserManagementSystem.Service;

import com.geekster.UserManagementSystem.Repository.UserRepository;
import com.geekster.UserManagementSystem.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    @Autowired
    UserRepository ur;

    public List<User> getuser(){
        return ur.getalluser();
    }
    public String adduser(User user){
        return ur.add(user);
    }
    public User getuserid(String userid){
        List<User> usernow=getuser();
        for(User user:usernow){
            if(user.getUserID().equals(userid)){
                return user;
            }
        }
        return null;
    }
    public String deleteuser(String userid){
        boolean removeuser=false;
        String status;
        if(userid!=null){
            List<User> userpresent=ur.getalluser();
            for(User user:userpresent){
                if(user.getUserID().equals(userid)){
                    removeuser=ur.delete(user);
                    if(removeuser){
                        status="User is removed successfully";
                    }else{
                        status="User is not removed..!!! database error";
                    }
                    return status;
                }
            }
            return "User does not exist";
        }
        return "Invalid user ID";
    }
    public String updateinfo(String userid,String phoneNO){
        boolean phonenumber=ur.update(userid,phoneNO);
        if(phonenumber){
            return "User details updated successful";
        }
        return "User is not found..";
    }
}
