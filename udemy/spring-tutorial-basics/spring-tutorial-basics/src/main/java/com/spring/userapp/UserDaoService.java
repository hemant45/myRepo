package com.spring.userapp;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

@Component
public class UserDaoService {
    static List<User> list = new ArrayList <User>();
    static int counter =5;
    static{
        list.add (new User(1,"Frodo",new Date()));
        list.add (new User(2,"Sam",new Date()));
        list.add (new User(3,"Gandalf",new Date()));
        list.add (new User(4,"Gimli",new Date()));
    }

    public List<User> findAll(){
        return list;
    }

    public User save (User user){
        if(user.getId()==null){
            counter++;
            user.setId(counter);

        } else {
            counter = user.getId();
        }
        list.add(user);
        return user;
    }

    public User findOne(int id){
        for(User user : list){
            if(user.getId()== id){
                return user;
            }
        }
        return null;
    }
}
