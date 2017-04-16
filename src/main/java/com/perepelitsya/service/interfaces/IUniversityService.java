package com.perepelitsya.service.interfaces;

import com.perepelitsya.entity.University;

import java.util.List;

/**
 * Created by Andriu on 10.04.2017.
 */
public interface IUniversityService {
    List<University> getAll();
    void delete(long id);
    University save(University university);
    University update(University university);
}
