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
@Table(name = "student_group")
public class GroupStudent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "curator")
    private String curator;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "groupStudent")
    private Set<Student> studentSet;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "faculty_id")
    @JsonIgnore
    private Faculty faculty;

    @Override
    public String toString() {
        return "GroupStudent{" + "id=" + id + ", name='" + name + '\'' + ", curator='" + curator + '\'' + studentSet + '}';
    }

}