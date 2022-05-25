package com.example.demo1status.service.imp;

import com.example.demo1status.dto.StatusDto;
import com.example.demo1status.entity.Status;
import com.example.demo1status.entity.User;
import com.example.demo1status.in.StatusIn;
import com.example.demo1status.mapper.StatusMapper;
import com.example.demo1status.res.StatusRepository;
import com.example.demo1status.res.UserRepository;
import com.example.demo1status.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StatusServiceImp implements StatusService {

    @Autowired
    private StatusRepository statusRepository;

    private StatusMapper statusMapper;

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<StatusDto> getAll() {
        List<Status> cards = statusRepository.findAll();
        List<StatusDto> statusDtos = cards.stream().map(it -> statusMapper.map(it)).collect(Collectors.toList());
        return  statusDtos;
    }

    @Override
    public Status create(StatusIn statusIn) {
        Status status = statusMapper.map(statusIn);
        return statusRepository.save(status);
    }

    @Override
    public Status update(Integer id_status, StatusIn statusIn) {
        Status status = statusRepository.findById_status(id_status);

        User user = status.getUser();
        if (statusIn.getId_status() != null){
            user = userRepository.findAllById(statusIn.getId_status());
            Status status1 = user.getStatus();
            user.setStatus(null);
            if (status1 != null){
                status1.setUser(null);
                statusRepository.save(status1);
            }
            userRepository.save(user);
        }
        if (statusIn.getUser() != null){
            user = statusIn.getUser();
        }
        Status status1 = statusMapper.map(statusIn,id_status,user);
        Status response = statusRepository.save(status1);
        return response;
    }

    @Override
    public void delete(Integer id_status) {
        Status status = statusRepository.findById_status(id_status);
        if (status.getUser() != null){
            User user = status.getUser();
            status.setUser(null);
            user.setStatus(null);
            userRepository.save(user);
        }
        statusRepository.delete(status);
    }
}
