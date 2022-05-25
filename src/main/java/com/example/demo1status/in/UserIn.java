package com.example.demo1status.in;

import com.example.demo1status.entity.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserIn {
        private Integer id;
        private String name;
        private Integer id_status;
		private Status status;
}
