package com.perepelitsya.service.interfaces;

import com.perepelitsya.entity.Faculty;

import java.util.List;

/**
 * Created by Andriu on 10.04.2017.
 */
public interface IFacultyService {
    List<Faculty> getAll();
    void delete(long id);
    Faculty save(Faculty faculty);
    Faculty update(Faculty faculty);
}
