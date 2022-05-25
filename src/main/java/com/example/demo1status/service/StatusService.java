package com.example.demo1status.service;

import com.example.demo1status.dto.StatusDto;
import com.example.demo1status.entity.Status;

import com.example.demo1status.in.StatusIn;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StatusService {
    List<StatusDto> getAll();
    Status create(StatusIn statusIn);
    Status update (Integer id_status, StatusIn statusIn);
    void delete(Integer id_status);
}
