package com.example.demo1status.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer id_status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_status", referencedColumnName = "id")
    @JsonIgnore
    private Status status;
    public void setStaus(Status status) {
        this.status = status;
        if (status != null) {
            status.setUser(this);
        }
    }

}
