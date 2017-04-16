package com.perepelitsya.repository;

import com.perepelitsya.entity.GroupStudent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Andriu on 10.04.2017.
 */
public interface GroupStudentRepository extends JpaRepository<GroupStudent, Long> {
    List<GroupStudent> findByName(String name);
}
