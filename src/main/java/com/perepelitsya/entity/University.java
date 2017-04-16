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
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "abreviatyre")
    private String abreviatyre;

    @OneToMany(mappedBy = "university", cascade =  CascadeType.ALL)

    private Set<Faculty> faculties;

    @Override
    public String toString() {
        return "University{" +
                ", fullname='" + fullname + '\'' +
                ", abreviatyre='" + abreviatyre + '\'' +
                ", faculties=" + faculties +
                '}';
    }
}
