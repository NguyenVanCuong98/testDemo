package com.example.demo1status.in;

import com.example.demo1status.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StatusIn {
    private Integer id_status ;
    private String name_status;
    private String thutu_status;
    private User user;
}
