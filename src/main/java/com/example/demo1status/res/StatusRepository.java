package com.example.demo1status.res;

import com.example.demo1status.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepository extends JpaRepository<Status,Integer> {
    Status findById_status(Integer id_status);
}
