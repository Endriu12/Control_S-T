package com.perepelitsya.service.impls;

import com.perepelitsya.entity.Faculty;
import com.perepelitsya.repository.FacultyRepository;
import com.perepelitsya.service.interfaces.IFacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Andriu on 10.04.2017.
 */
@Service
public class FacultyServiceImpl implements IFacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    @Override
    public List<Faculty> getAll() {
        return facultyRepository.findAll();
    }

    @Override
    public void delete(long id) {
        facultyRepository.delete(id);
    }

    @Override
    public Faculty save(Faculty faculty) {

        Faculty saved = facultyRepository.saveAndFlush(faculty);
        return saved;
    }

    @Override
    public Faculty update(Faculty faculty) {
        return facultyRepository.saveAndFlush(faculty);
    }
}