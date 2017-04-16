package com.perepelitsya.repository;

import com.perepelitsya.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Andriu on 07.04.2017.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByUsername(String username);
}
