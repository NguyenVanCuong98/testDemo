package com.example.demo1status.mapper;

import com.example.demo1status.in.UserIn;
import com.example.demo1status.dto.UserDto;
import com.example.demo1status.entity.User;

public class UserMapper {
    public static User map(UserIn userIn){
        User user = new User();
        user.setId(userIn.getId());
        user.setName(userIn.getName());
        user.setId_status(user.getId_status());
        return user;
    }

    public static UserDto map(User user){
        UserDto userDto1 = new UserDto();
        userDto1.setId(user.getId());
        userDto1.setName(user.getName());
        userDto1.setId_status(userDto1.getId_status());
        return userDto1;
    }
}
