package com.geekster.UserManagementSystem.Repository;

import com.geekster.UserManagementSystem.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserRepository {
    private List<User> userList;
    public UserRepository(){
        userList=new ArrayList<>();
        userList.add(new User("1","Prashanth","13-11-1998","prash@gmail.com","8660814463","12-01-2023","11:12:52"));
    }

    public List<User> getalluser(){
        return userList;
    }
    public String add(User user){
        userList.add(user);
        return "User added successfull";
    }
    public boolean delete(User user){
        userList.remove(user);
        return true;
    }
    public boolean update(String userid,String PhoneNO){
        for(User user:userList){
            if(user.getUserID().equals(userid)){
                //remove original
                delete(user);
                //update the user info
                user.setPhoneNO(PhoneNO);
                add(user);
                return true;
            }
        }
        return false;
    }
}
