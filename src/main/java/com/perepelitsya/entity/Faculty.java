package com.perepelitsya.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Andriu on 10.04.2017.
 */
@Entity
@Getter
@Setter
@Table(name = "faculty")
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "phonenumber")
    private String phonenumber;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "university_id")
    @JsonIgnore
    private University university;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "faculty")
    private Set<GroupStudent> groupStudentSet;

    @Override
    public String toString() {
        return "Faculty{" +
                ", fullname='" + fullname + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", groupStudentSet=" + groupStudentSet +
                '}';
    }
}
