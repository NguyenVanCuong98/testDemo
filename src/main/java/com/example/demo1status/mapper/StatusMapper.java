package com.example.demo1status.mapper;

import com.example.demo1status.dto.StatusDto;
import com.example.demo1status.entity.Status;
import com.example.demo1status.entity.User;
import com.example.demo1status.in.StatusIn;


public class StatusMapper {
    public static Status map(StatusIn statusIn){
        Status status = new Status();
        status.setId_status(statusIn.getId_status());
        status.setName_status(statusIn.getName_status());
        status.setThutu_status(statusIn.getThutu_status());
        return status;
    }

    public static StatusDto map(Status status){
        StatusDto statusDto = new StatusDto();
        statusDto.setId_status(status.getId_status());
        statusDto.setName_status(statusDto.getName_status());
        statusDto.setThutu_status(statusDto.getThutu_status());
        return statusDto;
    }
    public static Status map(StatusIn statusIn, Integer id_status, User user){

        Status status = new Status();
        status.setId_status(id_status);
        status.setName_status(statusIn.getName_status());
        status.setThutu_status(statusIn.getThutu_status());
        status.setUser(user);
        return status;
    }

}
