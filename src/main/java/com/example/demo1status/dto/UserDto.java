package com.example.demo1status.dto;

import com.example.demo1status.entity.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private Integer id;
    private String name;
    private Integer id_status;
    private Status status;

}
