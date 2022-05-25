package com.example.demo1status.res;

import com.example.demo1status.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "select * from users, status where users.id_status = status.id_status  order by id_status asc ",nativeQuery = true)
    List<User> findById_statusOrderById_statusAsc();
    User findAllById(Integer id);
}
