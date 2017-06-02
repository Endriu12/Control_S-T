package com.perepelitsya.repository;

import com.perepelitsya.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Andriu on 07.04.2017.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByUsername(String username);
}
