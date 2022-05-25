package com.example.demo1status.service.imp;

import com.example.demo1status.entity.User;
import com.example.demo1status.in.UserIn;
import com.example.demo1status.mapper.UserMapper;
import com.example.demo1status.res.UserRepository;
import com.example.demo1status.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;
 
    @Override
    public List<User> getAll() {
        List<User> list = (List<User>) userRepository.findById_statusOrderById_statusAsc();
        return list;
    }

    @Override
    public User create(UserIn userIn) {
        User user = UserMapper.map(userIn);
        return userRepository.save(user);
    }

    @Override
    public User update(Integer id, UserIn userIn) {
       User user = userRepository.findAllById(id);
       user.setId(id);
       user.setName(userIn.getName());
       return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        User user = userRepository.findAllById(id);
        userRepository.delete(user);
    }
}
