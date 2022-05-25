package com.example.demo1status.service;

import com.example.demo1status.entity.User;
import com.example.demo1status.in.UserIn;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface UserService {
    List<User> getAll();
    User create(UserIn userIn);
    User update (Integer id, UserIn userIn);
    void delete(Integer id);
}
