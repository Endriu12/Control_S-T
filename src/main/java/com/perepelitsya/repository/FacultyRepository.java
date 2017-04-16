package com.perepelitsya.repository;

import com.perepelitsya.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Andriu on 10.04.2017.
 */
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    List<Faculty> findByFullname(String fullname);
}
