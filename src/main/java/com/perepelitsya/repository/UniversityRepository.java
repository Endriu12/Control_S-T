package com.perepelitsya.repository;

import com.perepelitsya.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Andriu on 10.04.2017.
 */
public interface UniversityRepository extends JpaRepository<University, Long> {
    List<University> findByFullname(String fullname);
}