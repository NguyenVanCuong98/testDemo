package com.example.demo1status.controller;

import com.example.demo1status.dto.StatusDto;
import com.example.demo1status.entity.Status;
import com.example.demo1status.in.StatusIn;
import com.example.demo1status.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StatusController {
    @Autowired

    private StatusService statusService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public ResponseEntity<List<StatusDto>> getAllCustomer () {
        List<StatusDto> allCustomer = statusService.getAll();
        return new ResponseEntity<>(allCustomer , HttpStatus.OK);
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Status create(@RequestBody StatusIn statusIn){
        return statusService.create(statusIn);
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.PUT)
    public Status update(@RequestBody StatusIn statusIn, @PathVariable Integer id_status) {
        Status status = statusService.update(id_status,statusIn);
        return status;
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id){
        statusService.delete(id);
    }

}
