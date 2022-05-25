package com.example.demo1status.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "status")
public class Status {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_status ;
    @Column
    private String name_status;
    @Column
    private String thutu_status;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "status")
    @JsonIgnore
    private User user;
    public void setUser(User user) {
        this.user = user;
        if (user != null) {
            user.setStaus(this);
        }
    }


}
